package org.dark.delegate.listener;

import java.util.Date;

/**
 * @Title : ����Ĺ۲�����1��������Ҫ����۲���
 * @Description:
 * @author liwei
 *
 */
public class WatchingTVListener {

	public WatchingTVListener() {
		System.out.println("watching TV");
	}

	/**
	 * @Description	:	�ҷQ�@Щ��������䷽��
	 * 						���߿����f�����O �ߣ��^���ߡ���֪ͨ�ߣ���ʲ�N�o���^�������κ�һ��������������һ�b����
	 * 						�Á���ձO �߰l�͵���Ϣ
	 * @param date
	 */
	public void stopWatchingTV(Date date) {
		System.out.println("stop watching" + date.toLocaleString());
	}
}