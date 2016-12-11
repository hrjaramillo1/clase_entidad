/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utpl.arquitectura.profesores;

import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Rafael
 */
@Remote
public interface profesoresBeanRemote {
    List<Profesores> obtenerTodo();
}
