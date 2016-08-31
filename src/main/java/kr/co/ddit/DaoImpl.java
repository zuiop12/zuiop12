package kr.co.ddit;

import java.util.List;

public class DaoImpl implements Dao{

	private ServiceImpl service;
	
	
/*	public DaoImpl(ServiceImpl service){	
		this.service=service;
	}*/
	
	
	
	
	@Override
	public List<String> allList() {
		
		return service.allList();
	}

	public ServiceImpl getService() {
		return service;
	}

	public void setService(ServiceImpl service) {
		this.service = service;
	}

	@Override
	public int insert() {
		
		return service.insert();
	}

}
