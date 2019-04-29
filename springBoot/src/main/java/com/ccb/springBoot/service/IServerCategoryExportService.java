package com.ccb.springBoot.service;



import java.util.List;

import com.ccb.springBoot.model.ServerCategoryExport;



public interface IServerCategoryExportService {
	

	/**
                 * 根据服务事项编号查询
     * @param serverNum
     * @return
     */
    public ServerCategoryExport queryById(int serverNum);
    
    public int add(ServerCategoryExport serverCategoryExport);

	public List<ServerCategoryExport> listpage(String serverFilters, String demandWay);
    
	public int remove(int serverNum);

    
    
}
