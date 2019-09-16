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
*@version ����ʱ�䣺2017��9��14��
*@ClassName ������
*@Description ������
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-redis.xml")
public class SpringRedisTest {
	@Autowired
	public StringRedisTemplate stringRedisTemplate;
	@Test
	public void stringTest(){
		//aasdfasdf
		//c444
		//asdasdasd
		//c444
				//asdasdasd
		//ͨ������ģ���ȡ��String���Ͳ����Ķ���-ValueOperations
		ValueOperations<String, String> opsForValue = stringRedisTemplate.opsForValue();
		//���key-value
		//opsForValue.set("name", "ksdfdsfj");
		
		//������key-value��Ч��
		//opsForValue.set("time", "123", 10, TimeUnit.SECONDS);
		
		//׷��
//		opsForValue.append("name", "123");
		//��ȡԪ��ֵ
//		System.out.println(opsForValue.get("name"));
		
//		//ɾ��key-value
//		stringRedisTemplate.delete("name");
//		System.out.println(opsForValue.get("name"));
		
		//��������
		//opsForValue.increment("num", -10);
	}
	@Test
	public void listTest(){
		
		ListOperations<String, String> opsForList = stringRedisTemplate.opsForList();
		//���뵥��
//		opsForList.leftPush("list", "qq");
		
		//���������
//		opsForList.leftPush("list", "qq");
		
//		ArrayList<String> arrayList = new ArrayList<>();
//		arrayList.add("rr");
//		arrayList.add("tty");
//		arrayList.add("aa");
		//��������
//		opsForList.leftPushAll("list", arrayList);
		
		//��ȡindex��ΧԪ��
//		List<String> range = opsForList.range("list", 0, 3);
//		System.out.println(range);
		
//		System.out.println(opsForList.index("list", 3));
		
		//���ҵ�����һ����¼
//		String leftPop = opsForList.leftPop("list");
//		System.out.println(leftPop);
//		String riPop = opsForList.rightPop("list");
//		System.out.println(riPop);
		
		//����countsѡ��ͬɾ������
		//��ɾ��
//		opsForList.remove("list", 2, "tt");
//		//��ɾ��
//		opsForList.remove("list", -1, "tt");
//		//ȫɾ
//		opsForList.remove("list", 0, "tt");
		
		//�����±��޸�
		//opsForList.set("list", 1, "fangjicai");
		
		//��ȥ���ϳ���
		System.out.println(opsForList.size("list"));	
	}
	@Test
	public void hashTest(){
		HashOperations<String, Object, Object> opsForHash = stringRedisTemplate.opsForHash();
		//���뵥���ֶ�
		//opsForHash.put("hash", "name", "fangjicai");
		
//		HashMap<Object,Object> hashMap = new HashMap<>();
//		hashMap.put("age", "10");
//		hashMap.put("sex", "man");
//		//��������
//		opsForHash.putAll("hash", hashMap);
		
		//��ȡָ���ֶ�ֵ
		//System.out.println(opsForHash.get("hash", "name"));
		
//		System.out.println(opsForHash.size("hash"));
		
		//��ȡkey����value�ļ���
//		System.out.println(opsForHash.keys("hash"));
//		System.out.println(opsForHash.values("hash"));
	}
	@Test
	public void setTest(){
		SetOperations<String, String> opsForSet = stringRedisTemplate.opsForSet();
		//���뵥��
//		opsForSet.add("set", "qq");
		
		//��ȡ���г�Ա
//		Set<String> members = opsForSet.members("set");
//		System.out.println(members);
		
		//ɾ��Ԫ��
		//opsForSet.remove("set", "qq");
		
		//�鿴���ϳ�Ա�Ƿ����
//		Boolean member = opsForSet.isMember("set", "qq");
//		System.out.println(member);
		
		//��ȡ���ϳ���
		System.out.println(opsForSet.size("set"));
	}
	@Test
	public void zsetTest(){
		ZSetOperations<String, String> opsForZSet = stringRedisTemplate.opsForZSet();
		opsForZSet.add("zset", "eeee", 10);
	}

}
