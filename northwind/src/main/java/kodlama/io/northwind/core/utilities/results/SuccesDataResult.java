package kodlama.io.northwind.core.utilities.results;

public class SuccesDataResult<T> extends DataResult {

	public SuccesDataResult(T data, String message) {
		super(data, true,message);
		// TODO Auto-generated constructor stub
	}
	
	public SuccesDataResult(T data) {
		super(data,true);
	}
	
	public SuccesDataResult(String message) {
		super(null,true,message);
	}
	
	public SuccesDataResult() {
		super(null,true);
	}
}
