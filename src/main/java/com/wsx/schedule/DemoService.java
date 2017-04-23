package com.wsx.schedule;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
	private SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	//fixedRate,每5秒执行
	@Scheduled(fixedRate=5000)
	public void ttt(){
		System.out.println("fixedRate:::"+sdf.format(new Date()));
	}
	//cron 几个值对应秒,分,时,日,月,星期,年(可选,留空);;其中是每定点执行;下面是周一到周五每分钟0秒5秒时执行,多个用逗号隔开;
	@Scheduled(cron="0,5 * * * * MON-FRI")
	public void ttt2(){
		System.out.println("cron:::"+sdf.format(new Date()));
	}
}
