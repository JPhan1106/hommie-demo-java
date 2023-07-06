package coding.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import coding.db.DBUtil;
import coding.entity.Room;

public class RoomService {
	
	public List<Room> getThreeRooms () throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Room room = null;
		List<Room> list = new ArrayList<Room>();
		try {
//			make connection to mySQL
			conn = DBUtil.makeConnection();
			ps = conn.prepareStatement("select * from `room` limit 3");
			rs = ps.executeQuery();
			
			while (rs.next()) {
				int id = rs.getInt("id");
				String tittle = rs.getString("tittle");
				String description = rs.getString("description");
				float price = rs.getFloat("price");
				boolean hasInternet = rs.getBoolean("has_internet");
				boolean hasStudyDesk = rs.getBoolean("has_study_desk");
				boolean hasEnsuiteBathroom = rs.getBoolean("has_ensuite_bathroom");
				String image1Url = rs.getString("image1_url");
		
				room = new Room (id, tittle,description,  price, hasInternet,  hasStudyDesk,
						hasEnsuiteBathroom, image1Url);
				
				list.add(room);
				 System.out.println(list.get(0).getId());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
			if (conn != null) {
				conn.close ();
			}
		}

		return list;
	}
	
	public List<Room> getAllRooms () throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Room room = null;
		List<Room> list = new ArrayList<Room>();
		try {
//			make connection to mySQL
			conn = DBUtil.makeConnection();
			ps = conn.prepareStatement("select * from `room`");
			rs = ps.executeQuery();
			
			while (rs.next()) {
				int id = rs.getInt("id");
				String tittle = rs.getString("tittle");
				String description = rs.getString("description");
				float price = rs.getFloat("price");
				boolean hasInternet = rs.getBoolean("has_internet");
				boolean hasStudyDesk = rs.getBoolean("has_study_desk");
				boolean hasEnsuiteBathroom = rs.getBoolean("has_ensuite_bathroom");
				String image1Url = rs.getString("image1_url");
		
				room = new Room (id, tittle,description,  price, hasInternet,  hasStudyDesk,
						hasEnsuiteBathroom, image1Url);
				
				list.add(room);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
			if (conn != null) {
				conn.close ();
			}
		}

		return list;
	}
	
	public Room getRoomDetails(int roomId) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Room room = null;

		try {
//			make connection to mySQL
			conn = DBUtil.makeConnection();
			ps = conn.prepareStatement("select * from `room` where id =?");
			ps.setInt(1, roomId);
			rs = ps.executeQuery();
			
			if (rs.next()) {
				int id = rs.getInt("id");
				String tittle = rs.getString("tittle");
				String description = rs.getString("description");
				float price = rs.getFloat("price");
				float squareArea = rs.getFloat("square_area");
				boolean hasInternet = rs.getBoolean("has_internet");
				boolean hasStudyDesk = rs.getBoolean("has_study_desk");
				boolean hasEnsuiteBathroom = rs.getBoolean("has_ensuite_bathroom");
				String image1Url = rs.getString("image1_url");
				String image2Url= rs.getString("image2_url");
				String image3Url = rs.getString("image3_url");
				String image4Url = rs.getString("image1_url");
		
				room = new Room (id, tittle, description, price, squareArea, hasInternet,  hasStudyDesk,
						hasEnsuiteBathroom, image1Url, image2Url, image3Url, image4Url);
				

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
			if (conn != null) {
				conn.close ();
			}
		}

		return room;
	
}
}
