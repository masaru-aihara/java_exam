import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Exam3 {
    public static void main(String[] args) {
		// 接続情報
		String url = "jdbc:postgresql://localhost:5432/student";
		String user = "postgres";
		String password = "aimasa";

		Connection con = null; // 使用する変数の宣言
		PreparedStatement pstmt = null;
		String sql = null;
        ResultSet  rs = null;
		try {
			// (1)データベースに接続
			con = DriverManager.getConnection(url, user, password);

			// (2)SQL文を作成
			sql = "SELECT m.id, m.name , m.age, d.name AS d_name FROM test_members AS m INNER JOIN test_deps AS d ON m.dep_id = d.id;";

			// (3)SQL実行準備
			pstmt = con.prepareStatement(sql);

			// (4)SQL実行
			// ※ここにSQL実行処理を書く
            rs = pstmt.executeQuery();
			// (5)結果の操作
			// ※ここに結果の操作処理を書く
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String dep_name = rs.getString("d_name");
                System.out.println("id=" + id + ", name=" + name + ", age=" + age + ",dep_name=" + dep_name);
            }
            
		} catch (SQLException ex) {
			System.err.println("SQL = " + sql);
			ex.printStackTrace();
		} finally {
			try {
                 if(con != null){
                    con.close();
                }
                if(pstmt != null){
                    pstmt.close();
                }
                if(rs != null){
                    rs.close();
                }
				// (6) メモリの解放(切断)
			} catch (Exception ex) {}
		}
	}

}
