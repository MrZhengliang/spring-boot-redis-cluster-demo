package com.itclj;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.JedisCluster;


/**
 * Created by lujun.chen on 2017/3/3.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {

    @Autowired
    private JedisCluster jedisCluster;

    @Test
    public void get(){
       System.out.println("=============="+jedisCluster.get("youqian-spread-sync-to-mysql-date"));
    }

}
