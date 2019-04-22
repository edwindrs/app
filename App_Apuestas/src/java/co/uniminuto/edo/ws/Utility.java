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
package co.uniminuto.edo.ws;

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
            case 14:
                // void
                output.writeShort(14);
                break;
            case 15:
                // Equipo
                output.writeShort(15);
                co.uniminuto.edu.pojos.Equipo b_co_uniminuto_edu_pojos_Equipo = (co.uniminuto.edu.pojos.Equipo) o;
                writeObject(output, b_co_uniminuto_edu_pojos_Equipo.getIdequipo(), 5);
                writeObject(output, b_co_uniminuto_edu_pojos_Equipo.getEquipo(), 3);
                output.writeInt(b_co_uniminuto_edu_pojos_Equipo.getDeporteIddeporte());

                break;
            case 4:
                // Apuesta
                output.writeShort(4);
                co.uniminuto.edu.pojos.Apuesta b_co_uniminuto_edu_pojos_Apuesta = (co.uniminuto.edu.pojos.Apuesta) o;
                writeObject(output, b_co_uniminuto_edu_pojos_Apuesta.getIdApuesta(), 5);
                writeObject(output, b_co_uniminuto_edu_pojos_Apuesta.getApuesta(), 3);
                writeObject(output, b_co_uniminuto_edu_pojos_Apuesta.getValor(), 5);
                writeObject(output, b_co_uniminuto_edu_pojos_Apuesta.getEstado(), 16);
                output.writeInt(b_co_uniminuto_edu_pojos_Apuesta.getUsuarioIdusuario());
                output.writeInt(b_co_uniminuto_edu_pojos_Apuesta.getPartidoIdpartido());

                break;
            case 3:
                // String
                output.writeShort(3);
                output.writeUTF((String) o);
                break;
            case 16:
                // Byte
                output.writeShort(16);
                output.writeByte(((Byte) o).byteValue());
                break;
            case 5:
                // Integer
                output.writeShort(5);
                output.writeInt(((Integer) o).intValue());
                break;
            case 7:
                // List
                output.writeShort(7);
                @SuppressWarnings("unchecked") List<co.uniminuto.edu.pojos.Apuesta> g_7 = (List<co.uniminuto.edu.pojos.Apuesta>) o;
                output.writeInt(g_7.size());
                for (co.uniminuto.edu.pojos.Apuesta g : g_7) {
                    writeObject(output, g, 4);
                }
                break;
            case 11:
                // List
                output.writeShort(11);
                @SuppressWarnings("unchecked") List<co.uniminuto.edu.pojos.Partido> g_11 = (List<co.uniminuto.edu.pojos.Partido>) o;
                output.writeInt(g_11.size());
                for (co.uniminuto.edu.pojos.Partido g : g_11) {
                    writeObject(output, g, 12);
                }
                break;
            case 8:
                // List
                output.writeShort(8);
                @SuppressWarnings("unchecked") List<co.uniminuto.edu.pojos.Equipo> g_8 = (List<co.uniminuto.edu.pojos.Equipo>) o;
                output.writeInt(g_8.size());
                for (co.uniminuto.edu.pojos.Equipo g : g_8) {
                    writeObject(output, g, 15);
                }
                break;
            case 12:
                // Partido
                output.writeShort(12);
                co.uniminuto.edu.pojos.Partido b_co_uniminuto_edu_pojos_Partido = (co.uniminuto.edu.pojos.Partido) o;
                writeObject(output, b_co_uniminuto_edu_pojos_Partido.getIdpartido(), 5);
                writeObject(output, b_co_uniminuto_edu_pojos_Partido.getResultado(), 3);
                output.writeInt(b_co_uniminuto_edu_pojos_Partido.getEquipoIdequipo());
                output.writeInt(b_co_uniminuto_edu_pojos_Partido.getEquipoIdequipo1());

                break;
            case 13:
                // int
                output.writeShort(13);
                output.writeInt(((Integer) o).intValue());
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
            case 2:
                // byte
                return new Byte(in.readByte());
            case 3:
                // String
                result = in.readUTF();
                return result;
            case 5:
                // Integer
                result = new Integer(in.readInt());
                return result;
            case 13:
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
