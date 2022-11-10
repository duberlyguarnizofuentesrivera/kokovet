package com.michaelmascco.kokovet.model;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.michaelmascco.kokovet.config.Conexion;
import jakarta.servlet.http.HttpServletResponse;

public class ProductoDAO {

    Connection con;
    final Conexion conexion = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    public List<Producto> listar() {
        List<Producto> productos = new ArrayList<>();
        String sql = "select * from producto";

        try {
            con = conexion.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Producto p = new Producto();
                p.setId(rs.getInt(1));
                p.setNombres(rs.getString(2));
                p.setFoto(rs.getBinaryStream(3));
                p.setDetalle(rs.getString(4));
                p.setPrecio(rs.getDouble(5));
                p.setStock(rs.getInt(6));
                
                productos.add(p);
            }
        } catch (Exception e) {
            System.out.println("Error al listar productos: " + e);
        }
        
        return productos;
    }

    public void listarImg(int id, HttpServletResponse response) {
        String sql = "select * from producto where idProducto="+id;
        InputStream inputStream = null;
        OutputStream outputStream;
        BufferedInputStream bufferedInputStream;
        BufferedOutputStream bufferedOutputStream;

        try {
            outputStream = response.getOutputStream();
            con = conexion.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                inputStream=rs.getBinaryStream("Foto");
            }
            assert inputStream != null;
            bufferedInputStream= new BufferedInputStream(inputStream);
            bufferedOutputStream= new BufferedOutputStream(outputStream);
            int i;
            while ((i=bufferedInputStream.read())!=1) {                
                bufferedOutputStream.write(i);
            }
        } catch (IOException | SQLException e) {
            System.out.println("Error al listar imagen: " + e);
        }
    }
}
