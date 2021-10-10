/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.libraryModel;

/**
 *
 * @author afkda
 */
public class Controller {

    //-1 loi ket noi database
    //-2 loi cau sql
    public int SearchWord(String word, List<libraryModel> List) {
        Connection cnn = ConnectionDatabase.cnnDB();
        if (cnn == null) {
            return -1;
        } else {
            try {
                String sql = "SELECT * FROM `newword` WHERE word LIKE ?";

                //set cau lenh sql
                PreparedStatement ps = cnn.prepareStatement(sql);

                //dien String vao dau dau ?
                ps.setString(1, "%" + word + "%");

                //lay ket qua tren databse dua vao bien rs
                ResultSet rs = ps.executeQuery();

                //lay tung phan tu trong bien rs
                while (rs.next()) {
                    libraryModel library_model = new libraryModel();
                    library_model.setId(rs.getInt("id"));
                    library_model.setWord(rs.getString("word"));
                    library_model.setMean(rs.getString("mean"));
                    List.add(library_model);
                }
                return 1;
            } catch (SQLException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                return -2;
            }
        }

    }

    public int ShowListWord(List<libraryModel> List) {
        Connection cnn = ConnectionDatabase.cnnDB();
        if (cnn == null) {
            return -1;
        } else {
            try {
                String sql = "SELECT * FROM `newword`";
                PreparedStatement ps = cnn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    libraryModel library_model = new libraryModel();
                    library_model.setId(rs.getInt("id"));
                    library_model.setWord(rs.getString("word"));
                    library_model.setMean(rs.getString("mean"));
                    List.add(library_model);
                }
                return 1;
            } catch (SQLException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                return -2;
            }
        }

    }

    public int AddWord(libraryModel lbModel) {
        Connection cnn = ConnectionDatabase.cnnDB();
        if (cnn == null) {
            return -1;
        } else {
            try {
                String sql = "INSERT INTO `newword`(`word`, `mean`) VALUES (?,?)";
                PreparedStatement ps = cnn.prepareStatement(sql);
                ps.setString(1, lbModel.getWord());
                ps.setString(2, lbModel.getMean());
                return ps.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                return -2;
            }

        }

    }

    public int UpdateWord(libraryModel lbModel, String word) {
        Connection cnn = ConnectionDatabase.cnnDB();
        if (cnn == null) {
            return -1;
        } else {
            try {
                String sql = "UPDATE `newword` SET `mean`=? WHERE `word`=?";
                PreparedStatement ps = cnn.prepareStatement(sql);
                ps.setString(2, word);
                
                ps.setString(1, lbModel.getMean());
                ps.executeUpdate();
                return 1;
            } catch (SQLException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                return -2;
            }

        }

    }

    public int DeleteWord(String word) {
        Connection cnn = ConnectionDatabase.cnnDB();
        if (cnn == null) {
            return -1;
        } else {
            try {
                String sql = "DELETE FROM `newword` WHERE `word` = ?";
                PreparedStatement ps = cnn.prepareStatement(sql);
                ps.setString(1, word);
                return ps.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                return -2;
            }
        }
    }

}
