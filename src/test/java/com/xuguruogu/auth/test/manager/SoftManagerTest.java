package com.xuguruogu.auth.test.manager;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.xuguruogu.auth.dto.SoftDTO;
import com.xuguruogu.auth.service.SoftManager;
import com.xuguruogu.auth.test.TestBase;

public class SoftManagerTest extends TestBase {

	@Autowired
	private SoftManager softManager;

	@Test
	public void testSoftManager() {

		String softname = "天下无贼";
		String clientpubkey = "000000000000000";
		String serverprivkey = "111111111111111";
		SoftDTO dto = softManager.create(softname, 120, clientpubkey, serverprivkey);

		return;
	}
}