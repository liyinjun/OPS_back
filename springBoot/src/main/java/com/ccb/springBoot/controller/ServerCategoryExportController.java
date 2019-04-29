package com.ccb.springBoot.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ccb.springBoot.util.JsonData;
import com.ccb.springBoot.model.ServerCategoryExport;
import com.ccb.springBoot.service.IServerCategoryExportService;




//公有云服务目录接口
@RestController
@RequestMapping("/api/serverexport")
public class ServerCategoryExportController {
		
	@Autowired
	private IServerCategoryExportService serverCategoryExportService;
	
	@GetMapping("findbyid")
	public Object findById(int serverNum){
       return JsonData.buildSuccess(serverCategoryExportService.queryById(serverNum));
	}
    
	
	@GetMapping("add")
	public Object add(HttpServletRequest request ){
	   ServerCategoryExport serverCategoryExport = new ServerCategoryExport();
	   serverCategoryExport.setServerDepartment(request.getParameter("serverDepartment"));
	   serverCategoryExport.setServerOffice(request.getParameter("serverOffice"));
	   serverCategoryExport.setServerCategory(request.getParameter("serverCategory"));
	   serverCategoryExport.setServerIteamName(request.getParameter("serverIteamName"));
	   serverCategoryExport.setServerMeasure(request.getParameter("serverMeasure"));
	   serverCategoryExport.setServerUnitPrice(request.getParameter("serverUnitPrice"));
	   serverCategoryExport.setServerScene(request.getParameter("serverScene"));
	   serverCategoryExport.setServerContent(request.getParameter("serverContent"));
	   serverCategoryExport.setServerProvideUser(request.getParameter("serverProvideUser"));
	   serverCategoryExport.setServerProvideUserEmail(request.getParameter("serverProvideUserEmail"));
	   serverCategoryExport.setServerProvideUserPhone(request.getParameter("serverProvideUserPhone"));
       return JsonData.buildSuccess(serverCategoryExportService.add(serverCategoryExport));
	}
	
	@GetMapping("listpage")
	public Object listpage(String serverFilters ,String  demandWay){
		List<ServerCategoryExport> list = serverCategoryExportService.listpage(serverFilters,demandWay);
		int total ;
		if(null==list) {
			total=0 ;
		} else {			
			 total = list.size() ;
		}
       return JsonData.buildSuccess(list,total,200);
	}
	
	@GetMapping("remove")
	public Object listpage(int serverNum ){		
	       return JsonData.buildSuccess("s",serverCategoryExportService.remove(serverNum));
	}
}
