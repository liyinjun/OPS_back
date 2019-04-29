package com.ccb.springBoot.model;

public class ServerCategoryExport {
	
	//服务事项编号
	private int serverNum;
	
	//服务提供部门
	private String serverDepartment;
	
	//服务提供处室
    private String serverOffice;
    
    //服务类别
    private String serverCategory;
    
    //服务事项名称
    private String serverIteamName;
    
    //服务计量单位
    private String serverMeasure;
    
    //服务单价（元）
    private String serverUnitPrice;
    
    //使用场景
    private String serverScene;
    
    //服务内容
    private String serverContent;
    
    //服务提供方联系人
    private String serverProvideUser;
    
    //联系人邮箱
    private String serverProvideUserEmail;
    
   //联系人电话
    private String serverProvideUserPhone;

	public int getServerNum() {
		return serverNum;
	}

	public void setServerNum(int serverNum) {
		this.serverNum = serverNum;
	}

	public String getServerDepartment() {
		return serverDepartment;
	}

	public void setServerDepartment(String serverDepartment) {
		this.serverDepartment = serverDepartment;
	}

	public String getServerOffice() {
		return serverOffice;
	}

	public void setServerOffice(String serverOffice) {
		this.serverOffice = serverOffice;
	}

	public String getServerCategory() {
		return serverCategory;
	}

	public void setServerCategory(String serverCategory) {
		this.serverCategory = serverCategory;
	}

	public String getServerIteamName() {
		return serverIteamName;
	}

	public void setServerIteamName(String serverIteamName) {
		this.serverIteamName = serverIteamName;
	}

	public String getServerMeasure() {
		return serverMeasure;
	}

	public void setServerMeasure(String serverMeasure) {
		this.serverMeasure = serverMeasure;
	}

	public String getServerUnitPrice() {
		return serverUnitPrice;
	}

	public void setServerUnitPrice(String serverUnitPrice) {
		this.serverUnitPrice = serverUnitPrice;
	}

	public String getServerScene() {
		return serverScene;
	}

	public void setServerScene(String serverScene) {
		this.serverScene = serverScene;
	}

	public String getServerContent() {
		return serverContent;
	}

	public void setServerContent(String serverContent) {
		this.serverContent = serverContent;
	}

	public String getServerProvideUser() {
		return serverProvideUser;
	}

	public void setServerProvideUser(String serverProvideUser) {
		this.serverProvideUser = serverProvideUser;
	}

	public String getServerProvideUserEmail() {
		return serverProvideUserEmail;
	}

	public void setServerProvideUserEmail(String serverProvideUserEmail) {
		this.serverProvideUserEmail = serverProvideUserEmail;
	}

	public String getServerProvideUserPhone() {
		return serverProvideUserPhone;
	}

	public void setServerProvideUserPhone(String serverProvideUserPhone) {
		this.serverProvideUserPhone = serverProvideUserPhone;
	}
	       
}
