package com.sts.task1.Services.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.sts.task1.Entities.FoodProduct;
import com.sts.task1.Repositories.FoodProductRepository;
import com.sts.task1.Services.FoodProductService;

@Service
public class FoodProductServiceImpl implements FoodProductService {
	@Autowired
	private FoodProductRepository foodProductRepository;

	@Override
	public Page<FoodProduct> getAllFoodProducts(int page) {
		return foodProductRepository.findAll(PageRequest.of(page, 5));
	}

	@Override
	public Optional<FoodProduct> getFoodProductById(long id) {
		return foodProductRepository.findById(id);
	}

	@Override
	public void saveFoodProduct(FoodProduct foodProduct) {
		foodProductRepository.save(foodProduct);
	}

	@Override
	public void updateFoodProduct(FoodProduct foodProduct, long id) {
		
		FoodProduct  = foodProductRepository.findById(id).orElseThrow();
		
		foodProduct.setName(product.getName());
		foodProduct.setPrice(product.getPrice());
		
		foodProductRepository.save(foodProduct);
	}

	@Override
	public void deleteFoodProduct(long id) {
		foodProductRepository.deleteById(id);
	}

	@Override
	public List<FoodProduct> getAll() {

		List<FoodProduct> list=  this.foodProductRepository.findAll();
		return list;
	}
}
