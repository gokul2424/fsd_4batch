import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cts.Account;
import com.cts.AccountRepository;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans.xml")
public class TestTransferService {
	
	@Autowired
	AccountRepository accountRepo;

//	@Test
	public void test() {
		Account account = accountRepo.loadAccount(23);
		System.out.println(account);
	}
	
	@Test
	public void testAllAccounts() {
		List<Account> accounts = accountRepo.loadAllAccounts();
		System.out.println(accounts);
	}

}
