package com.sts.task1.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sts.task1.Entities.FoodProduct;
import com.sts.task1.Services.Impl.FoodProductServiceImpl;

@RestController
@RequestMapping("/products")
public class FoodProductController {
	@Autowired
	private FoodProductServiceImpl foodProductServiceImpl;

	@GetMapping()
	private List<FoodProduct> getAllFoodProducts() {
		return foodProductServiceImpl.getAll();
	}

	@GetMapping("/{id}")
	private Optional<FoodProduct> getFoodProductById(@PathVariable("id") long id) {
		return foodProductServiceImpl.getFoodProductById(id);
	}

	@PostMapping()
	private long saveFoodProduct(@RequestBody FoodProduct foodProduct) {
		foodProductServiceImpl.saveFoodProduct(foodProduct);
		return foodProduct.getId();
	}

	@PutMapping("/{id}")
	private FoodProduct updateFoodProduct(@RequestBody FoodProduct foodProduct) {
		foodProductServiceImpl.saveFoodProduct(foodProduct);
		return foodProduct;
	}

	@DeleteMapping("/id")
	private void deleteFoodProduct(@RequestParam("id") long id) {
		foodProductServiceImpl.deleteFoodProduct(id);
	}
}
