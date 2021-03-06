package com.example.service;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.Requests;
import com.example.model.Stock;
import com.example.repository.CategoryRepository;
import com.example.repository.RequestRepository;
import com.example.repository.StockLogRepository;

@Service
@Transactional
public class StockLogServiceImp implements StockLogService {

	@Resource
	private StockLogRepository stRepository;


	@Override
	public void saveAStock(Stock addedStock) {
		stRepository.saveAndFlush(addedStock);
		
	}

	@Override
	public ArrayList<Stock> getAllStock() {
		return (ArrayList<Stock>) stRepository.findAll();
	}

	@Override
	public ArrayList<Stock> findAllStockByDesc() {
		return stRepository.findAllStockByDesc();
	}


}
