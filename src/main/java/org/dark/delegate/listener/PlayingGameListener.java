package org.dark.delegate.listener;

import java.util.Date;

/**
 * @Title : ����Ĺ۲�����2��������Ҫ����۲���
 * @Description	:	����ǰ�挦EventĽ�ጣ�������һ�l�~��
 * @author liwei
 *
 */
public class PlayingGameListener {
	
	public PlayingGameListener() {
		System.out.println("playing");
	}

	/**
	 * @Description	:	�ҷQ�@Щ��������䷽��
	 * 						���߿����f�����O �ߣ��^���ߡ���֪ͨ�ߣ���ʲ�N�o���^�������κ�һ��������������һ�b����
	 * 						�Á���ձO �߰l�͵���Ϣ
	 * @param date
	 */
	public void stopPlayingGame(Date date) {
		System.out.println("stop playing" + date.toLocaleString());
	}
}