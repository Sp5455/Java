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

import com.sts.task1.Entities.FoodCategory;
import com.sts.task1.Services.Impl.FoodCategoryServiceImpl;

@RestController
@RequestMapping("/categories")
public class FoodCategoryController {
	@Autowired
	private FoodCategoryServiceImpl foodCategoryServiceImpl;

	@GetMapping("/page")
	private List<FoodCategory> getAllFoodCategories(@RequestParam("pageNo") Integer pageNo, @RequestParam("pageSize") Integer pageSize) {
		return foodCategoryServiceImpl.getAllUsersWithPagination(pageNo,pageSize);
	}
	
	@GetMapping()
	private List<FoodCategory> getAll(){
		return foodCategoryServiceImpl.getAll();
	}

	@GetMapping("/{id}")
	private Optional<FoodCategory> getFoodCategoryById(@PathVariable("id") long id) {
		return foodCategoryServiceImpl.getFoodCategoryById(id);
	}

	@PostMapping()
	private long saveFoodCategory(@RequestBody FoodCategory foodCategory) {
		foodCategoryServiceImpl.saveFoodCategory(foodCategory);
		return foodCategory.getId();
	}

	@PutMapping("/{id}")
	private FoodCategory updateFoodCategory(@RequestBody FoodCategory foodCategory) {
		foodCategoryServiceImpl.saveFoodCategory(foodCategory);
		return foodCategory;
	}

	@DeleteMapping("/{id}")
	private void deleteFoodCategory(@PathVariable("id") long id) {
		foodCategoryServiceImpl.deleteFoodCategory(id);
	}
}
