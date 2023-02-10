package com.sts.task1.Services.Impl;

import java.util.List;
import java.util.Optional;

import org.hibernate.boot.archive.scan.spi.ClassDescriptor.Categorization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.sts.task1.Entities.FoodCategory;
import com.sts.task1.Repositories.FoodCategoryRepository;
import com.sts.task1.Services.FoodCategoryService;

@Service
public class FoodCategoryServiceImpl implements FoodCategoryService {
	@Autowired
	private FoodCategoryRepository foodCategoryRepository;
	
	@Override
	public List<FoodCategory> getAllUsersWithPagination(Integer pageNumber, Integer pageSize) {
	
		Pageable pageable = PageRequest.of(pageNumber - 1, pageSize);
		Page<FoodCategory> page = this.foodCategoryRepository.findAll(pageable);
		
		List<FoodCategory> list = page.getContent();
		
		return list;	
	}

	@Override
	public List<FoodCategory> getAll() {
		
		return foodCategoryRepository.findAll();
	}

	@Override
	public Optional<FoodCategory> getFoodCategoryById(long id) {
		return foodCategoryRepository.findById(id);
	}

	@Override
	public void saveFoodCategory(FoodCategory foodCategory) {
		foodCategoryRepository.save(foodCategory);
	}

	@Override
	public void updateFoodCategory(FoodCategory foodCategory, long id) {
		foodCategoryRepository.save(foodCategory);
	}

	@Override
	public void deleteFoodCategory(long id) {
		foodCategoryRepository.deleteById(id);
	}
}
