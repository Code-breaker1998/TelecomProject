package com.ibm.cna.telecom;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.ibm.cna.telecom.model.Connection;
import com.ibm.cna.telecom.repository.ConnectionRepository;
import com.ibm.cna.telecom.service.ConnectionService;




@RunWith(SpringRunner.class)
@SpringBootTest
class TelecomApplicationTests {



	@Autowired
	public ConnectionService connService;

	@MockBean
	public ConnectionRepository connectionRepository;

	@Test
	public void saveConnectionTest() {
		Connection connection = new Connection(101, "1234","Fiber","Ram","Active");
		when(connectionRepository.save(connection)).thenReturn(connection);
		assertEquals(connection, connService.saveConnection(connection));
	}

}
