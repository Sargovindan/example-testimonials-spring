package cz.jiripinkas.example.dto;

import java.util.List;

public class DataTableResult {

	private List<Object> aaData;

	public List<Object> getAaData() {
		return aaData;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void setAaData(List aaData) {
		this.aaData = aaData;
	}

}
