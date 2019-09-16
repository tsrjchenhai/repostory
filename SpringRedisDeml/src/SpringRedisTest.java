import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.SetOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.core.ZSetOperations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sun.org.apache.xml.internal.serializer.OutputPropertiesFactory;

/**
*@author helon111
*@version 创建时间：2017年9月14日
*@ClassName 类名称
*@Description 类描述
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-redis.xml")
public class SpringRedisTest {
	@Autowired
	public StringRedisTemplate stringRedisTemplate;
	@Test
	public void stringTest(){
		//b
		//a
		//c
		//asdasdasd
		//通过操作模板获取对String类型操作的对象-ValueOperations
		ValueOperations<String, String> opsForValue = stringRedisTemplate.opsForValue();
		//添加key-value
		//opsForValue.set("name", "ksdfdsfj");
		
		//胡设置key-value有效期
		//opsForValue.set("time", "123", 10, TimeUnit.SECONDS);
		
		//追加
//		opsForValue.append("name", "123");
		//获取元素值
//		System.out.println(opsForValue.get("name"));
		
//		//删除key-value
//		stringRedisTemplate.delete("name");
//		System.out.println(opsForValue.get("name"));
		
		//增减操作
		//opsForValue.increment("num", -10);
	}
	@Test
	public void listTest(){
		
		ListOperations<String, String> opsForList = stringRedisTemplate.opsForList();
		//插入单条
//		opsForList.leftPush("list", "qq");
		
		//插入多条？
//		opsForList.leftPush("list", "qq");
		
//		ArrayList<String> arrayList = new ArrayList<>();
//		arrayList.add("rr");
//		arrayList.add("tty");
//		arrayList.add("aa");
		//批量插入
//		opsForList.leftPushAll("list", arrayList);
		
		//获取index范围元素
//		List<String> range = opsForList.range("list", 0, 3);
//		System.out.println(range);
		
//		System.out.println(opsForList.index("list", 3));
		
		//左右弹出第一条记录
//		String leftPop = opsForList.leftPop("list");
//		System.out.println(leftPop);
//		String riPop = opsForList.rightPop("list");
//		System.out.println(riPop);
		
		//根据counts选择不同删除策略
		//左删除
//		opsForList.remove("list", 2, "tt");
//		//右删除
//		opsForList.remove("list", -1, "tt");
//		//全删
//		opsForList.remove("list", 0, "tt");
		
		//根据下标修改
		//opsForList.set("list", 1, "fangjicai");
		
		//后去集合长度
		System.out.println(opsForList.size("list"));	
	}
	@Test
	public void hashTest(){
		HashOperations<String, Object, Object> opsForHash = stringRedisTemplate.opsForHash();
		//插入单条字段
		//opsForHash.put("hash", "name", "fangjicai");
		
//		HashMap<Object,Object> hashMap = new HashMap<>();
//		hashMap.put("age", "10");
//		hashMap.put("sex", "man");
//		//批量插入
//		opsForHash.putAll("hash", hashMap);
		
		//获取指定字段值
		//System.out.println(opsForHash.get("hash", "name"));
		
//		System.out.println(opsForHash.size("hash"));
		
		//获取key或者value的集合
//		System.out.println(opsForHash.keys("hash"));
//		System.out.println(opsForHash.values("hash"));
	}
	@Test
	public void setTest(){
		SetOperations<String, String> opsForSet = stringRedisTemplate.opsForSet();
		//插入单条
//		opsForSet.add("set", "qq");
		
		//获取所有成员
//		Set<String> members = opsForSet.members("set");
//		System.out.println(members);
		
		//删除元素
		//opsForSet.remove("set", "qq");
		
		//查看集合成员是否存在
//		Boolean member = opsForSet.isMember("set", "qq");
//		System.out.println(member);
		
		//获取集合长度
		System.out.println(opsForSet.size("set"));
	}
	@Test
	public void zsetTest(){
		ZSetOperations<String, String> opsForZSet = stringRedisTemplate.opsForZSet();
		opsForZSet.add("zset", "eeee", 10);
	}

}
