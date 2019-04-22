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
import javax.servlet.http.HttpSession;
import java.util.*;

/**
 * Invocation Gateways
 */
public class JavonGateways {

    /**
     * This class implements the application server connectivity specific to the
     * needs. co.uniminuto.edu.ws.apuestaws
     */
    public static class co_uniminuto_edo_ws_apuestawsverApuestasPago3Gateway implements InvocationAbstraction {

        /**
         * This method performs the actual invocation of server functionality.
         * It is used by the servlet to delegate functionality to external
         * classes.
         *
         * @param input The stream from which we should read the parameters for
         * the methods
         * @return The return value for the method NULL IS NOT SUPPORTED!!!!
         * @throws Exception Thrown when a protocol error occurs
         */
        public Object invoke(HttpSession session, DataInput input) throws Exception {

            co.uniminuto.edu.ws.apuestaws instance = (co.uniminuto.edu.ws.apuestaws) session.getAttribute("co.uniminuto.edu.ws.apuestaws");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.apuestaws) Class.forName("co.uniminuto.edu.ws.apuestaws").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.apuestaws", instance);
            }
            return instance.verApuestasPago();
        }

        public int[] getIds() {
            return new int[]{};
        }

        ;

        public int[] getReturnIds() {
            return new int[]{
                7
            };
        }
    ;

    }
    /**
     *  This class implements the application server connectivity specific to the needs.
     *  co.uniminuto.edu.ws.apuestaws
     */
    public static class co_uniminuto_edo_ws_apuestawsactualizarApuesta6Gateway implements InvocationAbstraction {

        /**
         * This method performs the actual invocation of server functionality.
         * It is used by the servlet to delegate functionality to external
         * classes.
         *
         * @param input The stream from which we should read the parameters for
         * the methods
         * @return The return value for the method NULL IS NOT SUPPORTED!!!!
         * @throws Exception Thrown when a protocol error occurs
         */
        public Object invoke(HttpSession session, DataInput input) throws Exception {
            int idApuesta = ((Integer) Utility.readObject(input)).intValue();

            co.uniminuto.edu.ws.apuestaws instance = (co.uniminuto.edu.ws.apuestaws) session.getAttribute("co.uniminuto.edu.ws.apuestaws");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.apuestaws) Class.forName("co.uniminuto.edu.ws.apuestaws").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.apuestaws", instance);
            }
            instance.actualizarApuesta(idApuesta);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                13
            };
        }

        ;

        public int[] getReturnIds() {
            return new int[]{
                14
            };
        }
    ;

    }
    /**
     *  This class implements the application server connectivity specific to the needs.
     *  co.uniminuto.edu.ws.apuestaws
     */
    public static class co_uniminuto_edo_ws_apuestawscrearApuesta1Gateway implements InvocationAbstraction {

        /**
         * This method performs the actual invocation of server functionality.
         * It is used by the servlet to delegate functionality to external
         * classes.
         *
         * @param input The stream from which we should read the parameters for
         * the methods
         * @return The return value for the method NULL IS NOT SUPPORTED!!!!
         * @throws Exception Thrown when a protocol error occurs
         */
        public Object invoke(HttpSession session, DataInput input) throws Exception {
            String apuesta = (String) Utility.readObject(input);
            int valor = ((Integer) Utility.readObject(input)).intValue();
            String fecha = (String) Utility.readObject(input);
            byte estado = ((Byte) Utility.readObject(input)).byteValue();
            int idusuario = ((Integer) Utility.readObject(input)).intValue();
            int idpartido = ((Integer) Utility.readObject(input)).intValue();

            co.uniminuto.edu.ws.apuestaws instance = (co.uniminuto.edu.ws.apuestaws) session.getAttribute("co.uniminuto.edu.ws.apuestaws");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.apuestaws) Class.forName("co.uniminuto.edu.ws.apuestaws").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.apuestaws", instance);
            }
            instance.crearApuesta(apuesta, valor, fecha, estado, idusuario, idpartido);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                3,
                13,
                3,
                2,
                13,
                13
            };
        }

        ;

        public int[] getReturnIds() {
            return new int[]{
                14
            };
        }
    ;

    }
    /**
     *  This class implements the application server connectivity specific to the needs.
     *  co.uniminuto.edu.ws.apuestaws
     */
    public static class co_uniminuto_edo_ws_apuestawsconsultaApuesta5Gateway implements InvocationAbstraction {

        /**
         * This method performs the actual invocation of server functionality.
         * It is used by the servlet to delegate functionality to external
         * classes.
         *
         * @param input The stream from which we should read the parameters for
         * the methods
         * @return The return value for the method NULL IS NOT SUPPORTED!!!!
         * @throws Exception Thrown when a protocol error occurs
         */
        public Object invoke(HttpSession session, DataInput input) throws Exception {
            int idApuesta = ((Integer) Utility.readObject(input)).intValue();

            co.uniminuto.edu.ws.apuestaws instance = (co.uniminuto.edu.ws.apuestaws) session.getAttribute("co.uniminuto.edu.ws.apuestaws");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.apuestaws) Class.forName("co.uniminuto.edu.ws.apuestaws").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.apuestaws", instance);
            }
            return instance.consultaApuesta(idApuesta);
        }

        public int[] getIds() {
            return new int[]{
                13
            };
        }

        ;

        public int[] getReturnIds() {
            return new int[]{
                4
            };
        }
    ;

    }
    /**
     *  This class implements the application server connectivity specific to the needs.
     *  co.uniminuto.edu.ws.apuestaws
     */
    public static class co_uniminuto_edo_ws_apuestawsverApuestasUsuario4Gateway implements InvocationAbstraction {

        /**
         * This method performs the actual invocation of server functionality.
         * It is used by the servlet to delegate functionality to external
         * classes.
         *
         * @param input The stream from which we should read the parameters for
         * the methods
         * @return The return value for the method NULL IS NOT SUPPORTED!!!!
         * @throws Exception Thrown when a protocol error occurs
         */
        public Object invoke(HttpSession session, DataInput input) throws Exception {
            int usuarioIdusuario = ((Integer) Utility.readObject(input)).intValue();

            co.uniminuto.edu.ws.apuestaws instance = (co.uniminuto.edu.ws.apuestaws) session.getAttribute("co.uniminuto.edu.ws.apuestaws");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.apuestaws) Class.forName("co.uniminuto.edu.ws.apuestaws").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.apuestaws", instance);
            }
            return instance.verApuestasUsuario(usuarioIdusuario);
        }

        public int[] getIds() {
            return new int[]{
                13
            };
        }

        ;

        public int[] getReturnIds() {
            return new int[]{
                7
            };
        }
    ;

    }
    /**
     *  This class implements the application server connectivity specific to the needs.
     *  co.uniminuto.edu.ws.apuestaws
     */
    public static class co_uniminuto_edo_ws_apuestawsverApuestas2Gateway implements InvocationAbstraction {

        /**
         * This method performs the actual invocation of server functionality.
         * It is used by the servlet to delegate functionality to external
         * classes.
         *
         * @param input The stream from which we should read the parameters for
         * the methods
         * @return The return value for the method NULL IS NOT SUPPORTED!!!!
         * @throws Exception Thrown when a protocol error occurs
         */
        public Object invoke(HttpSession session, DataInput input) throws Exception {

            co.uniminuto.edu.ws.apuestaws instance = (co.uniminuto.edu.ws.apuestaws) session.getAttribute("co.uniminuto.edu.ws.apuestaws");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.apuestaws) Class.forName("co.uniminuto.edu.ws.apuestaws").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.apuestaws", instance);
            }
            return instance.verApuestas();
        }

        public int[] getIds() {
            return new int[]{};
        }

        ;

        public int[] getReturnIds() {
            return new int[]{
                7
            };
        }
    ;

    }
    /**
     *  This class implements the application server connectivity specific to the needs.
     *  co.uniminuto.edu.ws.partidows
     */
    public static class co_uniminuto_edo_ws_partidowscrearPartido10Gateway implements InvocationAbstraction {

        /**
         * This method performs the actual invocation of server functionality.
         * It is used by the servlet to delegate functionality to external
         * classes.
         *
         * @param input The stream from which we should read the parameters for
         * the methods
         * @return The return value for the method NULL IS NOT SUPPORTED!!!!
         * @throws Exception Thrown when a protocol error occurs
         */
        public Object invoke(HttpSession session, DataInput input) throws Exception {
            String fecha = (String) Utility.readObject(input);
            String resultado = (String) Utility.readObject(input);
            int local = ((Integer) Utility.readObject(input)).intValue();
            int visita = ((Integer) Utility.readObject(input)).intValue();

            co.uniminuto.edu.ws.partidows instance = (co.uniminuto.edu.ws.partidows) session.getAttribute("co.uniminuto.edu.ws.partidows");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.partidows) Class.forName("co.uniminuto.edu.ws.partidows").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.partidows", instance);
            }
            instance.crearPartido(fecha, resultado, local, visita);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                3,
                3,
                13,
                13
            };
        }

        ;

        public int[] getReturnIds() {
            return new int[]{
                14
            };
        }
    ;

    }
    /**
     *  This class implements the application server connectivity specific to the needs.
     *  co.uniminuto.edu.ws.partidows
     */
    public static class co_uniminuto_edo_ws_partidowsconsultaPartido14Gateway implements InvocationAbstraction {

        /**
         * This method performs the actual invocation of server functionality.
         * It is used by the servlet to delegate functionality to external
         * classes.
         *
         * @param input The stream from which we should read the parameters for
         * the methods
         * @return The return value for the method NULL IS NOT SUPPORTED!!!!
         * @throws Exception Thrown when a protocol error occurs
         */
        public Object invoke(HttpSession session, DataInput input) throws Exception {
            int idpartido = ((Integer) Utility.readObject(input)).intValue();

            co.uniminuto.edu.ws.partidows instance = (co.uniminuto.edu.ws.partidows) session.getAttribute("co.uniminuto.edu.ws.partidows");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.partidows) Class.forName("co.uniminuto.edu.ws.partidows").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.partidows", instance);
            }
            return instance.consultaPartido(idpartido);
        }

        public int[] getIds() {
            return new int[]{
                13
            };
        }

        ;

        public int[] getReturnIds() {
            return new int[]{
                12
            };
        }
    ;

    }
    /**
     *  This class implements the application server connectivity specific to the needs.
     *  co.uniminuto.edu.ws.partidows
     */
    public static class co_uniminuto_edo_ws_partidowsactualizarResultado15Gateway implements InvocationAbstraction {

        /**
         * This method performs the actual invocation of server functionality.
         * It is used by the servlet to delegate functionality to external
         * classes.
         *
         * @param input The stream from which we should read the parameters for
         * the methods
         * @return The return value for the method NULL IS NOT SUPPORTED!!!!
         * @throws Exception Thrown when a protocol error occurs
         */
        public Object invoke(HttpSession session, DataInput input) throws Exception {
            int idpartido = ((Integer) Utility.readObject(input)).intValue();
            String resultado = (String) Utility.readObject(input);

            co.uniminuto.edu.ws.partidows instance = (co.uniminuto.edu.ws.partidows) session.getAttribute("co.uniminuto.edu.ws.partidows");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.partidows) Class.forName("co.uniminuto.edu.ws.partidows").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.partidows", instance);
            }
            instance.actualizarResultado(idpartido, resultado);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                13,
                3
            };
        }

        ;

        public int[] getReturnIds() {
            return new int[]{
                14
            };
        }
    ;

    }
    /**
     *  This class implements the application server connectivity specific to the needs.
     *  co.uniminuto.edu.ws.partidows
     */
    public static class co_uniminuto_edo_ws_partidowsverPartidos11Gateway implements InvocationAbstraction {

        /**
         * This method performs the actual invocation of server functionality.
         * It is used by the servlet to delegate functionality to external
         * classes.
         *
         * @param input The stream from which we should read the parameters for
         * the methods
         * @return The return value for the method NULL IS NOT SUPPORTED!!!!
         * @throws Exception Thrown when a protocol error occurs
         */
        public Object invoke(HttpSession session, DataInput input) throws Exception {

            co.uniminuto.edu.ws.partidows instance = (co.uniminuto.edu.ws.partidows) session.getAttribute("co.uniminuto.edu.ws.partidows");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.partidows) Class.forName("co.uniminuto.edu.ws.partidows").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.partidows", instance);
            }
            return instance.verPartidos();
        }

        public int[] getIds() {
            return new int[]{};
        }

        ;

        public int[] getReturnIds() {
            return new int[]{
                11
            };
        }
    ;

    }
    /**
     *  This class implements the application server connectivity specific to the needs.
     *  co.uniminuto.edu.ws.partidows
     */
    public static class co_uniminuto_edo_ws_partidowsverPartidosApostar13Gateway implements InvocationAbstraction {

        /**
         * This method performs the actual invocation of server functionality.
         * It is used by the servlet to delegate functionality to external
         * classes.
         *
         * @param input The stream from which we should read the parameters for
         * the methods
         * @return The return value for the method NULL IS NOT SUPPORTED!!!!
         * @throws Exception Thrown when a protocol error occurs
         */
        public Object invoke(HttpSession session, DataInput input) throws Exception {

            co.uniminuto.edu.ws.partidows instance = (co.uniminuto.edu.ws.partidows) session.getAttribute("co.uniminuto.edu.ws.partidows");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.partidows) Class.forName("co.uniminuto.edu.ws.partidows").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.partidows", instance);
            }
            return instance.verPartidosApostar();
        }

        public int[] getIds() {
            return new int[]{};
        }

        ;

        public int[] getReturnIds() {
            return new int[]{
                11
            };
        }
    ;

    }
    /**
     *  This class implements the application server connectivity specific to the needs.
     *  co.uniminuto.edu.ws.partidows
     */
    public static class co_uniminuto_edo_ws_partidowsverPartidosActualizar12Gateway implements InvocationAbstraction {

        /**
         * This method performs the actual invocation of server functionality.
         * It is used by the servlet to delegate functionality to external
         * classes.
         *
         * @param input The stream from which we should read the parameters for
         * the methods
         * @return The return value for the method NULL IS NOT SUPPORTED!!!!
         * @throws Exception Thrown when a protocol error occurs
         */
        public Object invoke(HttpSession session, DataInput input) throws Exception {

            co.uniminuto.edu.ws.partidows instance = (co.uniminuto.edu.ws.partidows) session.getAttribute("co.uniminuto.edu.ws.partidows");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.partidows) Class.forName("co.uniminuto.edu.ws.partidows").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.partidows", instance);
            }
            return instance.verPartidosActualizar();
        }

        public int[] getIds() {
            return new int[]{};
        }

        ;

        public int[] getReturnIds() {
            return new int[]{
                11
            };
        }
    ;

    }
    /**
     *  This class implements the application server connectivity specific to the needs.
     *  co.uniminuto.edu.ws.usuariows
     */
    public static class co_uniminuto_edo_ws_usuariowsconsultaSaldo19Gateway implements InvocationAbstraction {

        /**
         * This method performs the actual invocation of server functionality.
         * It is used by the servlet to delegate functionality to external
         * classes.
         *
         * @param input The stream from which we should read the parameters for
         * the methods
         * @return The return value for the method NULL IS NOT SUPPORTED!!!!
         * @throws Exception Thrown when a protocol error occurs
         */
        public Object invoke(HttpSession session, DataInput input) throws Exception {
            int idusuario = ((Integer) Utility.readObject(input)).intValue();

            co.uniminuto.edu.ws.usuariows instance = (co.uniminuto.edu.ws.usuariows) session.getAttribute("co.uniminuto.edu.ws.usuariows");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.usuariows) Class.forName("co.uniminuto.edu.ws.usuariows").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.usuariows", instance);
            }
            return instance.consultaSaldo(idusuario);
        }

        public int[] getIds() {
            return new int[]{
                13
            };
        }

        ;

        public int[] getReturnIds() {
            return new int[]{
                5
            };
        }
    ;

    }
    /**
     *  This class implements the application server connectivity specific to the needs.
     *  co.uniminuto.edu.ws.usuariows
     */
    public static class co_uniminuto_edo_ws_usuariowsregistro16Gateway implements InvocationAbstraction {

        /**
         * This method performs the actual invocation of server functionality.
         * It is used by the servlet to delegate functionality to external
         * classes.
         *
         * @param input The stream from which we should read the parameters for
         * the methods
         * @return The return value for the method NULL IS NOT SUPPORTED!!!!
         * @throws Exception Thrown when a protocol error occurs
         */
        public Object invoke(HttpSession session, DataInput input) throws Exception {
            int idusuario = ((Integer) Utility.readObject(input)).intValue();
            String password = (String) Utility.readObject(input);
            String nombre = (String) Utility.readObject(input);
            String apellido = (String) Utility.readObject(input);
            String telefono = (String) Utility.readObject(input);
            String correo = (String) Utility.readObject(input);

            co.uniminuto.edu.ws.usuariows instance = (co.uniminuto.edu.ws.usuariows) session.getAttribute("co.uniminuto.edu.ws.usuariows");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.usuariows) Class.forName("co.uniminuto.edu.ws.usuariows").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.usuariows", instance);
            }
            instance.registro(idusuario, password, nombre, apellido, telefono, correo);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                13,
                3,
                3,
                3,
                3,
                3
            };
        }

        ;

        public int[] getReturnIds() {
            return new int[]{
                14
            };
        }
    ;

    }
    /**
     *  This class implements the application server connectivity specific to the needs.
     *  co.uniminuto.edu.ws.usuariows
     */
    public static class co_uniminuto_edo_ws_usuariowssumarValor17Gateway implements InvocationAbstraction {

        /**
         * This method performs the actual invocation of server functionality.
         * It is used by the servlet to delegate functionality to external
         * classes.
         *
         * @param input The stream from which we should read the parameters for
         * the methods
         * @return The return value for the method NULL IS NOT SUPPORTED!!!!
         * @throws Exception Thrown when a protocol error occurs
         */
        public Object invoke(HttpSession session, DataInput input) throws Exception {
            int idusuario = ((Integer) Utility.readObject(input)).intValue();
            Integer valor = (Integer) Utility.readObject(input);

            co.uniminuto.edu.ws.usuariows instance = (co.uniminuto.edu.ws.usuariows) session.getAttribute("co.uniminuto.edu.ws.usuariows");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.usuariows) Class.forName("co.uniminuto.edu.ws.usuariows").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.usuariows", instance);
            }
            instance.sumarValor(idusuario, valor);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                13,
                5
            };
        }

        ;

        public int[] getReturnIds() {
            return new int[]{
                14
            };
        }
    ;

    }
    /**
     *  This class implements the application server connectivity specific to the needs.
     *  co.uniminuto.edu.ws.usuariows
     */
    public static class co_uniminuto_edo_ws_usuariowsrestarValor18Gateway implements InvocationAbstraction {

        /**
         * This method performs the actual invocation of server functionality.
         * It is used by the servlet to delegate functionality to external
         * classes.
         *
         * @param input The stream from which we should read the parameters for
         * the methods
         * @return The return value for the method NULL IS NOT SUPPORTED!!!!
         * @throws Exception Thrown when a protocol error occurs
         */
        public Object invoke(HttpSession session, DataInput input) throws Exception {
            int idusuario = ((Integer) Utility.readObject(input)).intValue();
            Integer valor = (Integer) Utility.readObject(input);

            co.uniminuto.edu.ws.usuariows instance = (co.uniminuto.edu.ws.usuariows) session.getAttribute("co.uniminuto.edu.ws.usuariows");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.usuariows) Class.forName("co.uniminuto.edu.ws.usuariows").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.usuariows", instance);
            }
            instance.restarValor(idusuario, valor);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                13,
                5
            };
        }

        ;

        public int[] getReturnIds() {
            return new int[]{
                14
            };
        }
    ;

    }
    /**
     *  This class implements the application server connectivity specific to the needs.
     *  co.uniminuto.edu.ws.equipows
     */
    public static class co_uniminuto_edo_ws_equipowscrearEquipo7Gateway implements InvocationAbstraction {

        /**
         * This method performs the actual invocation of server functionality.
         * It is used by the servlet to delegate functionality to external
         * classes.
         *
         * @param input The stream from which we should read the parameters for
         * the methods
         * @return The return value for the method NULL IS NOT SUPPORTED!!!!
         * @throws Exception Thrown when a protocol error occurs
         */
        public Object invoke(HttpSession session, DataInput input) throws Exception {
            String equipo = (String) Utility.readObject(input);
            int iddeporte = ((Integer) Utility.readObject(input)).intValue();

            co.uniminuto.edu.ws.equipows instance = (co.uniminuto.edu.ws.equipows) session.getAttribute("co.uniminuto.edu.ws.equipows");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.equipows) Class.forName("co.uniminuto.edu.ws.equipows").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.equipows", instance);
            }
            instance.crearEquipo(equipo, iddeporte);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                3,
                13
            };
        }

        ;

        public int[] getReturnIds() {
            return new int[]{
                14
            };
        }
    ;

    }
    /**
     *  This class implements the application server connectivity specific to the needs.
     *  co.uniminuto.edu.ws.equipows
     */
    public static class co_uniminuto_edo_ws_equipowsverEquipos8Gateway implements InvocationAbstraction {

        /**
         * This method performs the actual invocation of server functionality.
         * It is used by the servlet to delegate functionality to external
         * classes.
         *
         * @param input The stream from which we should read the parameters for
         * the methods
         * @return The return value for the method NULL IS NOT SUPPORTED!!!!
         * @throws Exception Thrown when a protocol error occurs
         */
        public Object invoke(HttpSession session, DataInput input) throws Exception {

            co.uniminuto.edu.ws.equipows instance = (co.uniminuto.edu.ws.equipows) session.getAttribute("co.uniminuto.edu.ws.equipows");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.equipows) Class.forName("co.uniminuto.edu.ws.equipows").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.equipows", instance);
            }
            return instance.verEquipos();
        }

        public int[] getIds() {
            return new int[]{};
        }

        ;

        public int[] getReturnIds() {
            return new int[]{
                8
            };
        }
    ;

    }
    /**
     *  This class implements the application server connectivity specific to the needs.
     *  co.uniminuto.edu.ws.equipows
     */
    public static class co_uniminuto_edo_ws_equipowsconsultarEquipo9Gateway implements InvocationAbstraction {

        /**
         * This method performs the actual invocation of server functionality.
         * It is used by the servlet to delegate functionality to external
         * classes.
         *
         * @param input The stream from which we should read the parameters for
         * the methods
         * @return The return value for the method NULL IS NOT SUPPORTED!!!!
         * @throws Exception Thrown when a protocol error occurs
         */
        public Object invoke(HttpSession session, DataInput input) throws Exception {
            int idequipo = ((Integer) Utility.readObject(input)).intValue();

            co.uniminuto.edu.ws.equipows instance = (co.uniminuto.edu.ws.equipows) session.getAttribute("co.uniminuto.edu.ws.equipows");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.equipows) Class.forName("co.uniminuto.edu.ws.equipows").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.equipows", instance);
            }
            return instance.consultarEquipo(idequipo);
        }

        public int[] getIds() {
            return new int[]{
                13
            };
        }

        ;

        public int[] getReturnIds() {
            return new int[]{
                3
            };
        }
    ;

    }

    private static Object readObject(DataInput in) throws IOException {
        return Utility.readObject(in);
    }
}
//GEN-END:Client
