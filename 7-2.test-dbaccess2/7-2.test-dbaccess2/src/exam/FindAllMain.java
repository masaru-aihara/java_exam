package exam;

import dto.Member;
import java.util.List;

import dao.MemberDao;

/**
 * findAll()メソッド、動作確認用の実行クラスです.
 * 
 * @author igamasayuki
 *
 */
public class FindAllMain {

	public static void main(String[] args) {
		MemberDao dao = new MemberDao();
		List<Member> list = dao.findAll();
		for (Member member : list) {
			System.out.println("id = " + member.getId() + " name = " + member.getName() + " age = " + member.getAge()
					+ " dep_id = " + member.getDepId());
		}

	}

}
