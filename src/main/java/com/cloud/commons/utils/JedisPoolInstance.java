package com.cloud.commons.utils;

import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * redis连接池示例
 * （单例模式）
 */
public class JedisPoolInstance {

    //redis服务器的ip地址
    private static final String HOST = "127.0.0.1";

    private static final String PASSWORD = "root";

    //redis服务器的端口
    private static final int PORT = 6379;

    //redis连接池对象
    private static JedisPool jedisPool = null;

    //私有构造方法
    private JedisPoolInstance() {
    }

    /**
     * 获取线程池实例对象
     *
     * @return JedisPool
     */
    public static JedisPool getJedisPoolInstanceWithPassword() {
        if (null == jedisPool) {
            synchronized (JedisPoolInstance.class) {
                if (null == jedisPool) {
                    //对连接池的参数进行配置，根据项目的实际情况配置这些参数
                    JedisPoolConfig poolConfig = new JedisPoolConfig();
                    poolConfig.setMaxTotal(1000);//最大连接数
                    poolConfig.setMaxIdle(32);//最大空闲连接数
                    poolConfig.setMaxWaitMillis(90 * 1000);//获取连接时的最大等待毫秒数
                    poolConfig.setTestOnBorrow(true);//在获取连接的时候检查连接有效性
                    jedisPool = new JedisPool(poolConfig, HOST, PORT, 15000, PASSWORD);
                }
            }
        }
        return jedisPool;
    }

    /**
     * @date: 2019/8/15
     * @description: 获取JedisPool
     */
    public static JedisPool getJedisPoolInstanceWithNoPassword() {
        if (null == jedisPool) {
            synchronized (JedisPoolInstance.class) {
                if (null == jedisPool) {
                    //对连接池的参数进行配置，根据项目的实际情况配置这些参数
                    JedisPoolConfig poolConfig = new JedisPoolConfig();
                    poolConfig.setMaxTotal(1000);//最大连接数
                    poolConfig.setMaxIdle(32);//最大空闲连接数
                    poolConfig.setMaxWaitMillis(90 * 1000);//获取连接时的最大等待毫秒数
                    poolConfig.setTestOnBorrow(true);//在获取连接的时候检查连接有效性
                    jedisPool = new JedisPool(poolConfig, HOST, PORT, 15000);
                }
            }
        }
        return jedisPool;
    }
}