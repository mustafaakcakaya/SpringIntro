package springIntro;


public class CustomerManager implements ICustomerService {
	
	private ICustomerDal customerDal;
	
//	public CustomerManager(ICustomerDal customerDal) {
//		this.customerDal = customerDal;
//	}

	public void setCustomerDal(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}

	public void add() {
		//i� kurallar� kontrol�
		//CustomerDal customer = new CustomerDal();
		customerDal.add();
	}
}
