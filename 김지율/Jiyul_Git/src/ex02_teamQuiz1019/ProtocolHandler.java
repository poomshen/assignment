package ex02_teamQuiz1019;

import java.util.List;

public class ProtocolHandler {
	private List<MyFilter> filters;

	public List<MyFilter> getFilters() {
		return filters;
	}

	public void setFilters(List<MyFilter> filters) {
		this.filters = filters;
	}
	
	public int Filter_length(){
		return filters.size();
	}
}
