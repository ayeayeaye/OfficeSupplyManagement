package com.example.service;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.model.Requests;
import com.example.repository.CategoryRepository;
import com.example.repository.RequestRepository;

@Service
public class RequestServiceImp implements RequestService {

	@Resource
	private RequestRepository repository;
	
	@Override
	public ArrayList<Requests> findStoreRequestPending() {
		ArrayList<Requests> storeReqPendList =  repository.findStoreRequestPending();
		return storeReqPendList;
	}
	
	@Override
	public ArrayList<Requests> findStoreAllReques() {
		ArrayList<Requests> storeReqDList =  repository.findStoreAllRequest();
		return storeReqDList;
	}

	@Override
	public ArrayList<Requests> findRequestsByDept(String id) {
		ArrayList<Requests> adeptReqList =  repository.findRequestsByDept(id);
		return adeptReqList;
	}

	@Override
	public Requests findARequestByReqId(Integer aRqId) {
		Requests disbReq = repository.findARequestByReqId(aRqId);
		return disbReq;
	}

	@Override
	public void saveRequest(Requests disbReq) {
		repository.saveAndFlush(disbReq);		
	}

	@Override
	public ArrayList<Requests> findTodayApproveRequests() {
		ArrayList<Requests> todayReqList =  repository.findTodayApproveRequests();
		return todayReqList;
	}

	@Override
	public void deleteRequest(Requests request) {
		repository.delete(request);	
	}

	@Override
	public Integer findMaxDeptRepCode(String drepCode) {
		Integer maxDepRepId = repository.findMaxDeptRepCode(drepCode);
		return maxDepRepId;
	}

	@Override
	public void saveNewRequest(Requests newReq) {
		repository.saveAndFlush(newReq);	
	}

	@Override
	public Integer findLastReqId() {
		return repository.findLastReqId();
	}

	@Override
	public ArrayList<Requests> findDeptPendingAllRequests(String deptCode) {
		return repository.findDeptPendingAllRequests(deptCode);
	}



}
