package com.ccb.springBoot.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ccb.springBoot.mapper.ServerCategoryExportMapper;
import com.ccb.springBoot.model.ServerCategoryExport;
import com.ccb.springBoot.service.IServerCategoryExportService;





@Service
public class ServerCategoryExportServiceImpl implements IServerCategoryExportService{
	
	@Autowired
	 private ServerCategoryExportMapper serverCategoryExportMapper;

	@Override
	public ServerCategoryExport queryById(int serverNum) {
		return serverCategoryExportMapper.findById(serverNum);
	}

	@Override
	public int add(ServerCategoryExport serverCategoryExport) {
		return serverCategoryExportMapper.insert(serverCategoryExport);
	}

	@Override
	public List<ServerCategoryExport> listpage(String serverFilters, String demandWay) {
		return serverCategoryExportMapper.listpage(serverFilters, demandWay);
	}

	@Override
	public int remove(int serverNum) {
		 return serverCategoryExportMapper.remove(serverNum);
		
	}
	


}
