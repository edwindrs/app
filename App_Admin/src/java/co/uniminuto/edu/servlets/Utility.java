//GEN-BEGIN:Client
/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright 2010 Oracle and/or its affiliates. All rights reserved.
 *
 * Oracle and Java are registered trademarks of Oracle and/or its affiliates.
 * Other names may be trademarks of their respective owners.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common
 * Development and Distribution License("CDDL") (collectively, the
 * "License"). You may not use this file except in compliance with the
 * License. You can obtain a copy of the License at
 * http://www.netbeans.org/cddl-gplv2.html
 * or nbbuild/licenses/CDDL-GPL-2-CP. See the License for the
 * specific language governing permissions and limitations under the
 * License.  When distributing the software, include this License Header
 * Notice in each file and include the License file at
 * nbbuild/licenses/CDDL-GPL-2-CP.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the GPL Version 2 section of the License file that
 * accompanied this code. If applicable, add the following below the
 * License Header, with the fields enclosed by brackets [] replaced by
 * your own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 *
 * If you wish your version of this file to be governed by only the CDDL
 * or only the GPL Version 2, indicate your decision by adding
 * "[Contributor] elects to include this software in this distribution
 * under the [CDDL or GPL Version 2] license." If you do not indicate a
 * single choice of license, a recipient has the option to distribute
 * your version of this file under either the CDDL, the GPL Version 2 or
 * to extend the choice of license to its licensees as provided above.
 * However, if you add GPL Version 2 code and therefore, elected the GPL
 * Version 2 license, then the option applies only if the new code is
 * made subject to such option by the copyright holder.
 *
 * Contributor(s):
 *
 * Portions Copyrighted 2009 Sun Microsystems, Inc.
 */
/**
 * This file is generated. Please do not change
 */
package co.uniminuto.edu.servlets;

import java.io.*;
import java.lang.reflect.*;
import java.util.*;

/**
 * This class is used as an external protocol utility. It is so we don't
 * generate as much code.
 */
public class Utility {

    /**
     * Marker for null. Null is a type and a value together.
     */
    private final static short NULL_TYPE = -1;

    /**
     * Marker for void return types.
     */
    public final static Object VOID_VALUE = new Object();

    /**
     * Sends return values to the client output stream.
     *
     * @param output The output stream into which all the data should be written
     * @param returnValue The value which we should write into the stream
     * @throws IOException If an error occured while writing the results
     */
    public static void writeResults(DataOutput output, Object returnValue, int[] paramIDs) throws IOException {
        for (int i = 0; i < paramIDs.length; i++) {
            writeObject(output, returnValue, paramIDs[i]);
        }
    }

    /**
     *
     * @param output
     * @param o
     * @throws java.io.IOException
     */
    public static void writeObject(DataOutput output, Object o, int id) throws IOException {
        if (o == null) {
            // write null type to the stream
            output.writeShort(NULL_TYPE);
            return;
        }
        switch (id) {
            case 1:
                // ConsultaSaldoResponse
                output.writeShort(1);
                co.uniminuto.edu.ws.ConsultaSaldoResponse b_co_uniminuto_edu_ws_ConsultaSaldoResponse = (co.uniminuto.edu.ws.ConsultaSaldoResponse) o;

                break;
            case 2:
                // RestarValor
                output.writeShort(2);
                co.uniminuto.edu.ws.RestarValor b_co_uniminuto_edu_ws_RestarValor = (co.uniminuto.edu.ws.RestarValor) o;
                output.writeInt(b_co_uniminuto_edu_ws_RestarValor.getIdusuario());
                writeObject(output, b_co_uniminuto_edu_ws_RestarValor.getValor(), 7);

                break;
            case 3:
                // Partido
                output.writeShort(3);
                co.uniminuto.edu.ws.Partido b_co_uniminuto_edu_ws_Partido = (co.uniminuto.edu.ws.Partido) o;
                output.writeInt(b_co_uniminuto_edu_ws_Partido.getEquipoIdequipo());
                output.writeInt(b_co_uniminuto_edu_ws_Partido.getEquipoIdequipo1());
                writeObject(output, b_co_uniminuto_edu_ws_Partido.getIdpartido(), 7);
                writeObject(output, b_co_uniminuto_edu_ws_Partido.getResultado(), 5);

                break;
            case 4:
                // RegistroResponse
                output.writeShort(4);
                co.uniminuto.edu.ws.RegistroResponse b_co_uniminuto_edu_ws_RegistroResponse = (co.uniminuto.edu.ws.RegistroResponse) o;

                break;
            case 5:
                // String
                output.writeShort(5);
                output.writeUTF((String) o);
                break;
            case 6:
                // Usuario
                output.writeShort(6);
                co.uniminuto.edu.ws.Usuario b_co_uniminuto_edu_ws_Usuario = (co.uniminuto.edu.ws.Usuario) o;
                writeObject(output, b_co_uniminuto_edu_ws_Usuario.getApellido(), 5);
                writeObject(output, b_co_uniminuto_edu_ws_Usuario.getCorreo(), 5);
                output.writeInt(b_co_uniminuto_edu_ws_Usuario.getIdusuario());
                writeObject(output, b_co_uniminuto_edu_ws_Usuario.getNombre(), 5);
                writeObject(output, b_co_uniminuto_edu_ws_Usuario.getPassword(), 5);
                writeObject(output, b_co_uniminuto_edu_ws_Usuario.getRol(), 15);
                writeObject(output, b_co_uniminuto_edu_ws_Usuario.getSaldo(), 7);
                writeObject(output, b_co_uniminuto_edu_ws_Usuario.getTelefono(), 5);

                break;
            case 7:
                // Integer
                output.writeShort(7);
                output.writeInt(((Integer) o).intValue());
                break;
            case 10:
                // List
                output.writeShort(10);
                @SuppressWarnings("unchecked") List<co.uniminuto.edu.ws.Deporte> g_10 = (List<co.uniminuto.edu.ws.Deporte>) o;
                output.writeInt(g_10.size());
                for (co.uniminuto.edu.ws.Deporte g : g_10) {
                    writeObject(output, g, 18);
                }
                break;
            case 8:
                // List
                output.writeShort(8);
                @SuppressWarnings("unchecked") List<co.uniminuto.edu.ws.Equipo> g_8 = (List<co.uniminuto.edu.ws.Equipo>) o;
                output.writeInt(g_8.size());
                for (co.uniminuto.edu.ws.Equipo g : g_8) {
                    writeObject(output, g, 13);
                }
                break;
            case 9:
                // List
                output.writeShort(9);
                @SuppressWarnings("unchecked") List<co.uniminuto.edu.ws.Partido> g_9 = (List<co.uniminuto.edu.ws.Partido>) o;
                output.writeInt(g_9.size());
                for (co.uniminuto.edu.ws.Partido g : g_9) {
                    writeObject(output, g, 3);
                }
                break;
            case 11:
                // int
                output.writeShort(11);
                output.writeInt(((Integer) o).intValue());
                break;
            case 12:
                // void
                output.writeShort(12);
                break;
            case 13:
                // Equipo
                output.writeShort(13);
                co.uniminuto.edu.ws.Equipo b_co_uniminuto_edu_ws_Equipo = (co.uniminuto.edu.ws.Equipo) o;
                output.writeInt(b_co_uniminuto_edu_ws_Equipo.getDeporteIddeporte());
                writeObject(output, b_co_uniminuto_edu_ws_Equipo.getEquipo(), 5);
                writeObject(output, b_co_uniminuto_edu_ws_Equipo.getIdequipo(), 7);

                break;
            case 14:
                // ConsultaUsuario
                output.writeShort(14);
                co.uniminuto.edu.ws.ConsultaUsuario b_co_uniminuto_edu_ws_ConsultaUsuario = (co.uniminuto.edu.ws.ConsultaUsuario) o;
                output.writeInt(b_co_uniminuto_edu_ws_ConsultaUsuario.getIdusuario());

                break;
            case 15:
                // Byte
                output.writeShort(15);
                output.writeByte(((Byte) o).byteValue());
                break;
            case 16:
                // ConsultaUsuarioResponse
                output.writeShort(16);
                co.uniminuto.edu.ws.ConsultaUsuarioResponse b_co_uniminuto_edu_ws_ConsultaUsuarioResponse = (co.uniminuto.edu.ws.ConsultaUsuarioResponse) o;

                break;
            case 17:
                // ConsultaSaldo
                output.writeShort(17);
                co.uniminuto.edu.ws.ConsultaSaldo b_co_uniminuto_edu_ws_ConsultaSaldo = (co.uniminuto.edu.ws.ConsultaSaldo) o;
                output.writeInt(b_co_uniminuto_edu_ws_ConsultaSaldo.getIdusuario());

                break;
            case 18:
                // Deporte
                output.writeShort(18);
                co.uniminuto.edu.ws.Deporte b_co_uniminuto_edu_ws_Deporte = (co.uniminuto.edu.ws.Deporte) o;
                writeObject(output, b_co_uniminuto_edu_ws_Deporte.getDeporte(), 5);
                writeObject(output, b_co_uniminuto_edu_ws_Deporte.getIddeporte(), 7);

                break;
            case 19:
                // SumarValor
                output.writeShort(19);
                co.uniminuto.edu.ws.SumarValor b_co_uniminuto_edu_ws_SumarValor = (co.uniminuto.edu.ws.SumarValor) o;
                output.writeInt(b_co_uniminuto_edu_ws_SumarValor.getIdusuario());
                writeObject(output, b_co_uniminuto_edu_ws_SumarValor.getValor(), 7);

                break;
            case 20:
                // Registro
                output.writeShort(20);
                co.uniminuto.edu.ws.Registro b_co_uniminuto_edu_ws_Registro = (co.uniminuto.edu.ws.Registro) o;
                output.writeInt(b_co_uniminuto_edu_ws_Registro.getIdusuario());
                writeObject(output, b_co_uniminuto_edu_ws_Registro.getPassword(), 5);
                writeObject(output, b_co_uniminuto_edu_ws_Registro.getNombre(), 5);
                writeObject(output, b_co_uniminuto_edu_ws_Registro.getApellido(), 5);
                writeObject(output, b_co_uniminuto_edu_ws_Registro.getTelefono(), 5);
                writeObject(output, b_co_uniminuto_edu_ws_Registro.getCorreo(), 5);

                break;
            default:
                // default if a data type is not supported
                throw new IllegalArgumentException("Unsupported parameter type: " + o.getClass());
        }
    }

    /**
     *
     * @param in
     * @return
     * @throws java.io.IOException
     */
    protected static Object readObject(DataInput in) throws IOException {
        short type = in.readShort();
        Object result;
        switch (type) {
            case 3:
                // Partido
                co.uniminuto.edu.ws.Partido b_co_uniminuto_edu_ws_Partido = new co.uniminuto.edu.ws.Partido();
                b_co_uniminuto_edu_ws_Partido.setEquipoIdequipo(in.readInt());
                b_co_uniminuto_edu_ws_Partido.setEquipoIdequipo1(in.readInt());
                b_co_uniminuto_edu_ws_Partido.setIdpartido((Integer) readObject(in));
                b_co_uniminuto_edu_ws_Partido.setResultado((String) readObject(in));
                result = b_co_uniminuto_edu_ws_Partido;

                return result;
            case 5:
                // String
                result = in.readUTF();
                return result;
            case 6:
                // Usuario
                co.uniminuto.edu.ws.Usuario b_co_uniminuto_edu_ws_Usuario = new co.uniminuto.edu.ws.Usuario();
                b_co_uniminuto_edu_ws_Usuario.setApellido((String) readObject(in));
                b_co_uniminuto_edu_ws_Usuario.setCorreo((String) readObject(in));
                b_co_uniminuto_edu_ws_Usuario.setIdusuario(in.readInt());
                b_co_uniminuto_edu_ws_Usuario.setNombre((String) readObject(in));
                b_co_uniminuto_edu_ws_Usuario.setPassword((String) readObject(in));
                b_co_uniminuto_edu_ws_Usuario.setRol((Byte) readObject(in));
                b_co_uniminuto_edu_ws_Usuario.setSaldo((Integer) readObject(in));
                b_co_uniminuto_edu_ws_Usuario.setTelefono((String) readObject(in));
                result = b_co_uniminuto_edu_ws_Usuario;

                return result;
            case 15:
                // Byte
                result = new Byte(in.readByte());
                return result;
            case 7:
                // Integer
                result = new Integer(in.readInt());
                return result;
            case 11:
                // int
                return new Integer(in.readInt());
            case NULL_TYPE:
                /* null */
                return null;
            default:
                throw new IllegalArgumentException(
                        "Unsupported return type (" + type + ")");
        }
    }
}
//GEN-END:Client
