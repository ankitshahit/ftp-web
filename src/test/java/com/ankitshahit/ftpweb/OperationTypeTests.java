package com.ankitshahit.ftpweb;

import com.ankitshahit.ftpweb.core.permission.OperationType;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OperationTypeTests {
    @Test
    public void createOnlyAccess() {
        Assert.assertEquals("CREATE_ONLY", OperationType.CREATE_ONLY);
    }
}
