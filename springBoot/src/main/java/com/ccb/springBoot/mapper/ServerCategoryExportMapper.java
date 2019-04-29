package com.ccb.springBoot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.ccb.springBoot.model.ServerCategoryExport;


public interface ServerCategoryExportMapper {

	  @Select("SELECT * FROM ServerCategoryExport WHERE  serverNum=#{serverNum}")
	  ServerCategoryExport findById(int serverNum);
	  
	  @Insert("INSERT INTO ServerCategoryExport(serverDepartment,serverOffice,serverCategory,serverIteamName,serverMeasure,serverUnitPrice,"
	  		+ "serverScene,serverContent,serverProvideUser, serverProvideUserEmail,serverProvideUserPhone) "
	  		+ "VALUES(#{serverDepartment}, #{serverOffice}, #{serverCategory},#{serverIteamName},#{serverMeasure},#{serverUnitPrice},"
	  		+ "#{serverScene},#{serverContent},#{serverProvideUser},#{serverProvideUserEmail},#{serverProvideUserPhone})")
	  //keyProperty java对象的属性；keyColumn表示数据库的字段
	  @Options(useGeneratedKeys=true, keyProperty="serverNum", keyColumn="serverNum")   
	  int insert(ServerCategoryExport serverCategoryExport);

	  @Select("SELECT * FROM ServerCategoryExport WHERE  ${serverFilters} LIKE concat(concat('%',#{demandWay}),'%') limit 0,20")
	  List<ServerCategoryExport> listpage(String serverFilters, String demandWay);

	  @Delete("delete FROM ServerCategoryExport WHERE  serverNum=#{serverNum}")
	  int remove(int serverNum);
	  
}
