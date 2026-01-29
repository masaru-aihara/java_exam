package exam;

import dto.Member;
import dao.MemberDao;

/**
 * update()メソッド、動作確認用の実行クラスです.
 * 
 * @author igamasayuki
 *
 */
public class UpdateMain {
	public static void main(String[] args) {

		MemberDao dao = new MemberDao();
		Member member = dao.load(2); // id入れる

		member.setAge(100);
		System.out.println( "id= " + member.getId());
		System.out.println( "name= " + member.getName());
		System.out.println( "age= " + member.getAge());
		System.out.println( "dep_id= " + member.getDepId());
		dao.update(member);

		System.out.println("update終了");
	}
}
