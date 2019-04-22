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
import javax.servlet.http.HttpSession;
import java.util.*;

/**
 * Invocation Gateways
 */
public class JavonGateways {

    /**
     * This class implements the application server connectivity specific to the
     * needs. co.uniminuto.edu.ws.Equipo
     */
    public static class co_uniminuto_edu_servlets_EquipogetDeporteIddeporte46Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.Equipo instance = (co.uniminuto.edu.ws.Equipo) session.getAttribute("co.uniminuto.edu.ws.Equipo");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Equipo) Class.forName("co.uniminuto.edu.ws.Equipo").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Equipo", instance);
            }
            return new Integer(instance.getDeporteIddeporte());
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
     *  co.uniminuto.edu.ws.Equipo
     */
    public static class co_uniminuto_edu_servlets_EquipogetIdequipo50Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.Equipo instance = (co.uniminuto.edu.ws.Equipo) session.getAttribute("co.uniminuto.edu.ws.Equipo");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Equipo) Class.forName("co.uniminuto.edu.ws.Equipo").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Equipo", instance);
            }
            return instance.getIdequipo();
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
     *  co.uniminuto.edu.ws.Equipo
     */
    public static class co_uniminuto_edu_servlets_EquiposetEquipo49Gateway implements InvocationAbstraction {

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
            String value = (String) Utility.readObject(input);

            co.uniminuto.edu.ws.Equipo instance = (co.uniminuto.edu.ws.Equipo) session.getAttribute("co.uniminuto.edu.ws.Equipo");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Equipo) Class.forName("co.uniminuto.edu.ws.Equipo").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Equipo", instance);
            }
            instance.setEquipo(value);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                5
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
     *  co.uniminuto.edu.ws.Equipo
     */
    public static class co_uniminuto_edu_servlets_EquiposetIdequipo51Gateway implements InvocationAbstraction {

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
            Integer value = (Integer) Utility.readObject(input);

            co.uniminuto.edu.ws.Equipo instance = (co.uniminuto.edu.ws.Equipo) session.getAttribute("co.uniminuto.edu.ws.Equipo");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Equipo) Class.forName("co.uniminuto.edu.ws.Equipo").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Equipo", instance);
            }
            instance.setIdequipo(value);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                7
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
     *  co.uniminuto.edu.ws.Equipo
     */
    public static class co_uniminuto_edu_servlets_EquiposetDeporteIddeporte47Gateway implements InvocationAbstraction {

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
            int value = ((Integer) Utility.readObject(input)).intValue();

            co.uniminuto.edu.ws.Equipo instance = (co.uniminuto.edu.ws.Equipo) session.getAttribute("co.uniminuto.edu.ws.Equipo");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Equipo) Class.forName("co.uniminuto.edu.ws.Equipo").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Equipo", instance);
            }
            instance.setDeporteIddeporte(value);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                11
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
     *  co.uniminuto.edu.ws.Equipo
     */
    public static class co_uniminuto_edu_servlets_EquipogetEquipo48Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.Equipo instance = (co.uniminuto.edu.ws.Equipo) session.getAttribute("co.uniminuto.edu.ws.Equipo");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Equipo) Class.forName("co.uniminuto.edu.ws.Equipo").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Equipo", instance);
            }
            return instance.getEquipo();
        }

        public int[] getIds() {
            return new int[]{};
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
     *  co.uniminuto.edu.ws.Partido
     */
    public static class co_uniminuto_edu_servlets_PartidosetResultado79Gateway implements InvocationAbstraction {

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
            String value = (String) Utility.readObject(input);

            co.uniminuto.edu.ws.Partido instance = (co.uniminuto.edu.ws.Partido) session.getAttribute("co.uniminuto.edu.ws.Partido");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Partido) Class.forName("co.uniminuto.edu.ws.Partido").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Partido", instance);
            }
            instance.setResultado(value);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                5
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
     *  co.uniminuto.edu.ws.Partido
     */
    public static class co_uniminuto_edu_servlets_PartidosetIdpartido77Gateway implements InvocationAbstraction {

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
            Integer value = (Integer) Utility.readObject(input);

            co.uniminuto.edu.ws.Partido instance = (co.uniminuto.edu.ws.Partido) session.getAttribute("co.uniminuto.edu.ws.Partido");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Partido) Class.forName("co.uniminuto.edu.ws.Partido").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Partido", instance);
            }
            instance.setIdpartido(value);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                7
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
     *  co.uniminuto.edu.ws.Partido
     */
    public static class co_uniminuto_edu_servlets_PartidogetEquipoIdequipo72Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.Partido instance = (co.uniminuto.edu.ws.Partido) session.getAttribute("co.uniminuto.edu.ws.Partido");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Partido) Class.forName("co.uniminuto.edu.ws.Partido").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Partido", instance);
            }
            return new Integer(instance.getEquipoIdequipo());
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
     *  co.uniminuto.edu.ws.Partido
     */
    public static class co_uniminuto_edu_servlets_PartidogetEquipoIdequipo174Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.Partido instance = (co.uniminuto.edu.ws.Partido) session.getAttribute("co.uniminuto.edu.ws.Partido");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Partido) Class.forName("co.uniminuto.edu.ws.Partido").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Partido", instance);
            }
            return new Integer(instance.getEquipoIdequipo1());
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
     *  co.uniminuto.edu.ws.Partido
     */
    public static class co_uniminuto_edu_servlets_PartidosetEquipoIdequipo175Gateway implements InvocationAbstraction {

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
            int value = ((Integer) Utility.readObject(input)).intValue();

            co.uniminuto.edu.ws.Partido instance = (co.uniminuto.edu.ws.Partido) session.getAttribute("co.uniminuto.edu.ws.Partido");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Partido) Class.forName("co.uniminuto.edu.ws.Partido").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Partido", instance);
            }
            instance.setEquipoIdequipo1(value);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                11
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
     *  co.uniminuto.edu.ws.Partido
     */
    public static class co_uniminuto_edu_servlets_PartidogetResultado78Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.Partido instance = (co.uniminuto.edu.ws.Partido) session.getAttribute("co.uniminuto.edu.ws.Partido");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Partido) Class.forName("co.uniminuto.edu.ws.Partido").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Partido", instance);
            }
            return instance.getResultado();
        }

        public int[] getIds() {
            return new int[]{};
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
     *  co.uniminuto.edu.ws.Partido
     */
    public static class co_uniminuto_edu_servlets_PartidogetIdpartido76Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.Partido instance = (co.uniminuto.edu.ws.Partido) session.getAttribute("co.uniminuto.edu.ws.Partido");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Partido) Class.forName("co.uniminuto.edu.ws.Partido").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Partido", instance);
            }
            return instance.getIdpartido();
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
     *  co.uniminuto.edu.ws.Partido
     */
    public static class co_uniminuto_edu_servlets_PartidosetEquipoIdequipo73Gateway implements InvocationAbstraction {

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
            int value = ((Integer) Utility.readObject(input)).intValue();

            co.uniminuto.edu.ws.Partido instance = (co.uniminuto.edu.ws.Partido) session.getAttribute("co.uniminuto.edu.ws.Partido");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Partido) Class.forName("co.uniminuto.edu.ws.Partido").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Partido", instance);
            }
            instance.setEquipoIdequipo(value);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                11
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
     *  co.uniminuto.edu.ws.ConsultaUsuarioResponse
     */
    public static class co_uniminuto_edu_servlets_ConsultaUsuarioResponsesetReturn20Gateway implements InvocationAbstraction {

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
            co.uniminuto.edu.ws.Usuario value = (co.uniminuto.edu.ws.Usuario) Utility.readObject(input);

            co.uniminuto.edu.ws.ConsultaUsuarioResponse instance = (co.uniminuto.edu.ws.ConsultaUsuarioResponse) session.getAttribute("co.uniminuto.edu.ws.ConsultaUsuarioResponse");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.ConsultaUsuarioResponse) Class.forName("co.uniminuto.edu.ws.ConsultaUsuarioResponse").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.ConsultaUsuarioResponse", instance);
            }
            instance.setReturn(value);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                6
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
     *  co.uniminuto.edu.ws.ConsultaUsuarioResponse
     */
    public static class co_uniminuto_edu_servlets_ConsultaUsuarioResponsegetReturn19Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.ConsultaUsuarioResponse instance = (co.uniminuto.edu.ws.ConsultaUsuarioResponse) session.getAttribute("co.uniminuto.edu.ws.ConsultaUsuarioResponse");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.ConsultaUsuarioResponse) Class.forName("co.uniminuto.edu.ws.ConsultaUsuarioResponse").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.ConsultaUsuarioResponse", instance);
            }
            return instance.getReturn();
        }

        public int[] getIds() {
            return new int[]{};
        }

        ;

        public int[] getReturnIds() {
            return new int[]{
                6
            };
        }
    ;

    }
    /**
     *  This class implements the application server connectivity specific to the needs.
     *  co.uniminuto.edu.ws.Registro
     */
    public static class co_uniminuto_edu_servlets_RegistrosetTelefono95Gateway implements InvocationAbstraction {

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
            String value = (String) Utility.readObject(input);

            co.uniminuto.edu.ws.Registro instance = (co.uniminuto.edu.ws.Registro) session.getAttribute("co.uniminuto.edu.ws.Registro");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Registro) Class.forName("co.uniminuto.edu.ws.Registro").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Registro", instance);
            }
            instance.setTelefono(value);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                5
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
     *  co.uniminuto.edu.ws.Registro
     */
    public static class co_uniminuto_edu_servlets_RegistrogetTelefono94Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.Registro instance = (co.uniminuto.edu.ws.Registro) session.getAttribute("co.uniminuto.edu.ws.Registro");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Registro) Class.forName("co.uniminuto.edu.ws.Registro").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Registro", instance);
            }
            return instance.getTelefono();
        }

        public int[] getIds() {
            return new int[]{};
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
     *  co.uniminuto.edu.ws.Registro
     */
    public static class co_uniminuto_edu_servlets_RegistrosetIdusuario87Gateway implements InvocationAbstraction {

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
            int value = ((Integer) Utility.readObject(input)).intValue();

            co.uniminuto.edu.ws.Registro instance = (co.uniminuto.edu.ws.Registro) session.getAttribute("co.uniminuto.edu.ws.Registro");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Registro) Class.forName("co.uniminuto.edu.ws.Registro").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Registro", instance);
            }
            instance.setIdusuario(value);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                11
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
     *  co.uniminuto.edu.ws.Registro
     */
    public static class co_uniminuto_edu_servlets_RegistrosetNombre91Gateway implements InvocationAbstraction {

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
            String value = (String) Utility.readObject(input);

            co.uniminuto.edu.ws.Registro instance = (co.uniminuto.edu.ws.Registro) session.getAttribute("co.uniminuto.edu.ws.Registro");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Registro) Class.forName("co.uniminuto.edu.ws.Registro").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Registro", instance);
            }
            instance.setNombre(value);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                5
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
     *  co.uniminuto.edu.ws.Registro
     */
    public static class co_uniminuto_edu_servlets_RegistrogetApellido92Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.Registro instance = (co.uniminuto.edu.ws.Registro) session.getAttribute("co.uniminuto.edu.ws.Registro");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Registro) Class.forName("co.uniminuto.edu.ws.Registro").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Registro", instance);
            }
            return instance.getApellido();
        }

        public int[] getIds() {
            return new int[]{};
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
     *  co.uniminuto.edu.ws.Registro
     */
    public static class co_uniminuto_edu_servlets_RegistrosetPassword89Gateway implements InvocationAbstraction {

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
            String value = (String) Utility.readObject(input);

            co.uniminuto.edu.ws.Registro instance = (co.uniminuto.edu.ws.Registro) session.getAttribute("co.uniminuto.edu.ws.Registro");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Registro) Class.forName("co.uniminuto.edu.ws.Registro").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Registro", instance);
            }
            instance.setPassword(value);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                5
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
     *  co.uniminuto.edu.ws.Registro
     */
    public static class co_uniminuto_edu_servlets_RegistrogetIdusuario86Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.Registro instance = (co.uniminuto.edu.ws.Registro) session.getAttribute("co.uniminuto.edu.ws.Registro");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Registro) Class.forName("co.uniminuto.edu.ws.Registro").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Registro", instance);
            }
            return new Integer(instance.getIdusuario());
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
     *  co.uniminuto.edu.ws.Registro
     */
    public static class co_uniminuto_edu_servlets_RegistrogetPassword88Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.Registro instance = (co.uniminuto.edu.ws.Registro) session.getAttribute("co.uniminuto.edu.ws.Registro");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Registro) Class.forName("co.uniminuto.edu.ws.Registro").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Registro", instance);
            }
            return instance.getPassword();
        }

        public int[] getIds() {
            return new int[]{};
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
     *  co.uniminuto.edu.ws.Registro
     */
    public static class co_uniminuto_edu_servlets_RegistrogetNombre90Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.Registro instance = (co.uniminuto.edu.ws.Registro) session.getAttribute("co.uniminuto.edu.ws.Registro");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Registro) Class.forName("co.uniminuto.edu.ws.Registro").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Registro", instance);
            }
            return instance.getNombre();
        }

        public int[] getIds() {
            return new int[]{};
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
     *  co.uniminuto.edu.ws.Registro
     */
    public static class co_uniminuto_edu_servlets_RegistrogetCorreo96Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.Registro instance = (co.uniminuto.edu.ws.Registro) session.getAttribute("co.uniminuto.edu.ws.Registro");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Registro) Class.forName("co.uniminuto.edu.ws.Registro").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Registro", instance);
            }
            return instance.getCorreo();
        }

        public int[] getIds() {
            return new int[]{};
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
     *  co.uniminuto.edu.ws.Registro
     */
    public static class co_uniminuto_edu_servlets_RegistrosetApellido93Gateway implements InvocationAbstraction {

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
            String value = (String) Utility.readObject(input);

            co.uniminuto.edu.ws.Registro instance = (co.uniminuto.edu.ws.Registro) session.getAttribute("co.uniminuto.edu.ws.Registro");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Registro) Class.forName("co.uniminuto.edu.ws.Registro").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Registro", instance);
            }
            instance.setApellido(value);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                5
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
     *  co.uniminuto.edu.ws.Registro
     */
    public static class co_uniminuto_edu_servlets_RegistrosetCorreo97Gateway implements InvocationAbstraction {

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
            String value = (String) Utility.readObject(input);

            co.uniminuto.edu.ws.Registro instance = (co.uniminuto.edu.ws.Registro) session.getAttribute("co.uniminuto.edu.ws.Registro");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Registro) Class.forName("co.uniminuto.edu.ws.Registro").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Registro", instance);
            }
            instance.setCorreo(value);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                5
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
     *  co.uniminuto.edu.ws.ConsultarEquipoResponse
     */
    public static class co_uniminuto_edu_servlets_ConsultarEquipoResponsesetReturn24Gateway implements InvocationAbstraction {

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
            String value = (String) Utility.readObject(input);

            co.uniminuto.edu.ws.ConsultarEquipoResponse instance = (co.uniminuto.edu.ws.ConsultarEquipoResponse) session.getAttribute("co.uniminuto.edu.ws.ConsultarEquipoResponse");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.ConsultarEquipoResponse) Class.forName("co.uniminuto.edu.ws.ConsultarEquipoResponse").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.ConsultarEquipoResponse", instance);
            }
            instance.setReturn(value);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                5
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
     *  co.uniminuto.edu.ws.ConsultarEquipoResponse
     */
    public static class co_uniminuto_edu_servlets_ConsultarEquipoResponsegetReturn23Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.ConsultarEquipoResponse instance = (co.uniminuto.edu.ws.ConsultarEquipoResponse) session.getAttribute("co.uniminuto.edu.ws.ConsultarEquipoResponse");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.ConsultarEquipoResponse) Class.forName("co.uniminuto.edu.ws.ConsultarEquipoResponse").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.ConsultarEquipoResponse", instance);
            }
            return instance.getReturn();
        }

        public int[] getIds() {
            return new int[]{};
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
     *  co.uniminuto.edu.ws.Usuariows
     */
    public static class co_uniminuto_edu_servlets_UsuariowsconsultaSaldo123Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.Usuariows instance = (co.uniminuto.edu.ws.Usuariows) session.getAttribute("co.uniminuto.edu.ws.Usuariows");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Usuariows) Class.forName("co.uniminuto.edu.ws.Usuariows").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Usuariows", instance);
            }
            return instance.consultaSaldo(idusuario);
        }

        public int[] getIds() {
            return new int[]{
                11
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
     *  co.uniminuto.edu.ws.Usuariows
     */
    public static class co_uniminuto_edu_servlets_UsuariowsconsultaUsuario122Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.Usuariows instance = (co.uniminuto.edu.ws.Usuariows) session.getAttribute("co.uniminuto.edu.ws.Usuariows");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Usuariows) Class.forName("co.uniminuto.edu.ws.Usuariows").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Usuariows", instance);
            }
            return instance.consultaUsuario(idusuario);
        }

        public int[] getIds() {
            return new int[]{
                11
            };
        }

        ;

        public int[] getReturnIds() {
            return new int[]{
                6
            };
        }
    ;

    }
    /**
     *  This class implements the application server connectivity specific to the needs.
     *  co.uniminuto.edu.ws.Usuariows
     */
    public static class co_uniminuto_edu_servlets_UsuariowssumarValor124Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.Usuariows instance = (co.uniminuto.edu.ws.Usuariows) session.getAttribute("co.uniminuto.edu.ws.Usuariows");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Usuariows) Class.forName("co.uniminuto.edu.ws.Usuariows").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Usuariows", instance);
            }
            instance.sumarValor(idusuario, valor);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                11,
                7
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
     *  co.uniminuto.edu.ws.Usuariows
     */
    public static class co_uniminuto_edu_servlets_Usuariowsregistro125Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.Usuariows instance = (co.uniminuto.edu.ws.Usuariows) session.getAttribute("co.uniminuto.edu.ws.Usuariows");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Usuariows) Class.forName("co.uniminuto.edu.ws.Usuariows").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Usuariows", instance);
            }
            instance.registro(idusuario, password, nombre, apellido, telefono, correo);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                11,
                5,
                5,
                5,
                5,
                5
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
     *  co.uniminuto.edu.ws.Usuariows
     */
    public static class co_uniminuto_edu_servlets_UsuariowsrestarValor126Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.Usuariows instance = (co.uniminuto.edu.ws.Usuariows) session.getAttribute("co.uniminuto.edu.ws.Usuariows");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Usuariows) Class.forName("co.uniminuto.edu.ws.Usuariows").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Usuariows", instance);
            }
            instance.restarValor(idusuario, valor);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                11,
                7
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
     *  co.uniminuto.edu.ws.VerDeportesResponse
     */
    public static class co_uniminuto_edu_servlets_VerDeportesResponsegetReturn127Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.VerDeportesResponse instance = (co.uniminuto.edu.ws.VerDeportesResponse) session.getAttribute("co.uniminuto.edu.ws.VerDeportesResponse");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.VerDeportesResponse) Class.forName("co.uniminuto.edu.ws.VerDeportesResponse").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.VerDeportesResponse", instance);
            }
            return instance.getReturn();
        }

        public int[] getIds() {
            return new int[]{};
        }

        ;

        public int[] getReturnIds() {
            return new int[]{
                10
            };
        }
    ;

    }
    /**
     *  This class implements the application server connectivity specific to the needs.
     *  co.uniminuto.edu.ws.VerEquiposResponse
     */
    public static class co_uniminuto_edu_servlets_VerEquiposResponsegetReturn128Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.VerEquiposResponse instance = (co.uniminuto.edu.ws.VerEquiposResponse) session.getAttribute("co.uniminuto.edu.ws.VerEquiposResponse");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.VerEquiposResponse) Class.forName("co.uniminuto.edu.ws.VerEquiposResponse").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.VerEquiposResponse", instance);
            }
            return instance.getReturn();
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
     *  co.uniminuto.edu.ws.ConsultaDeporteResponse
     */
    public static class co_uniminuto_edu_servlets_ConsultaDeporteResponsegetReturn7Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.ConsultaDeporteResponse instance = (co.uniminuto.edu.ws.ConsultaDeporteResponse) session.getAttribute("co.uniminuto.edu.ws.ConsultaDeporteResponse");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.ConsultaDeporteResponse) Class.forName("co.uniminuto.edu.ws.ConsultaDeporteResponse").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.ConsultaDeporteResponse", instance);
            }
            return instance.getReturn();
        }

        public int[] getIds() {
            return new int[]{};
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
     *  co.uniminuto.edu.ws.ConsultaDeporteResponse
     */
    public static class co_uniminuto_edu_servlets_ConsultaDeporteResponsesetReturn8Gateway implements InvocationAbstraction {

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
            String value = (String) Utility.readObject(input);

            co.uniminuto.edu.ws.ConsultaDeporteResponse instance = (co.uniminuto.edu.ws.ConsultaDeporteResponse) session.getAttribute("co.uniminuto.edu.ws.ConsultaDeporteResponse");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.ConsultaDeporteResponse) Class.forName("co.uniminuto.edu.ws.ConsultaDeporteResponse").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.ConsultaDeporteResponse", instance);
            }
            instance.setReturn(value);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                5
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
     *  co.uniminuto.edu.ws.VerPartidosApostarResponse
     */
    public static class co_uniminuto_edu_servlets_VerPartidosApostarResponsegetReturn130Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.VerPartidosApostarResponse instance = (co.uniminuto.edu.ws.VerPartidosApostarResponse) session.getAttribute("co.uniminuto.edu.ws.VerPartidosApostarResponse");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.VerPartidosApostarResponse) Class.forName("co.uniminuto.edu.ws.VerPartidosApostarResponse").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.VerPartidosApostarResponse", instance);
            }
            return instance.getReturn();
        }

        public int[] getIds() {
            return new int[]{};
        }

        ;

        public int[] getReturnIds() {
            return new int[]{
                9
            };
        }
    ;

    }
    /**
     *  This class implements the application server connectivity specific to the needs.
     *  co.uniminuto.edu.ws.CrearDeporte
     */
    public static class co_uniminuto_edu_servlets_CrearDeportesetDeporte26Gateway implements InvocationAbstraction {

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
            String value = (String) Utility.readObject(input);

            co.uniminuto.edu.ws.CrearDeporte instance = (co.uniminuto.edu.ws.CrearDeporte) session.getAttribute("co.uniminuto.edu.ws.CrearDeporte");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.CrearDeporte) Class.forName("co.uniminuto.edu.ws.CrearDeporte").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.CrearDeporte", instance);
            }
            instance.setDeporte(value);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                5
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
     *  co.uniminuto.edu.ws.CrearDeporte
     */
    public static class co_uniminuto_edu_servlets_CrearDeportegetDeporte25Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.CrearDeporte instance = (co.uniminuto.edu.ws.CrearDeporte) session.getAttribute("co.uniminuto.edu.ws.CrearDeporte");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.CrearDeporte) Class.forName("co.uniminuto.edu.ws.CrearDeporte").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.CrearDeporte", instance);
            }
            return instance.getDeporte();
        }

        public int[] getIds() {
            return new int[]{};
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
     *  co.uniminuto.edu.ws.VerPartidosResponse
     */
    public static class co_uniminuto_edu_servlets_VerPartidosResponsegetReturn131Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.VerPartidosResponse instance = (co.uniminuto.edu.ws.VerPartidosResponse) session.getAttribute("co.uniminuto.edu.ws.VerPartidosResponse");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.VerPartidosResponse) Class.forName("co.uniminuto.edu.ws.VerPartidosResponse").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.VerPartidosResponse", instance);
            }
            return instance.getReturn();
        }

        public int[] getIds() {
            return new int[]{};
        }

        ;

        public int[] getReturnIds() {
            return new int[]{
                9
            };
        }
    ;

    }
    /**
     *  This class implements the application server connectivity specific to the needs.
     *  co.uniminuto.edu.ws.CrearEquipo
     */
    public static class co_uniminuto_edu_servlets_CrearEquiposetEquipo28Gateway implements InvocationAbstraction {

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
            String value = (String) Utility.readObject(input);

            co.uniminuto.edu.ws.CrearEquipo instance = (co.uniminuto.edu.ws.CrearEquipo) session.getAttribute("co.uniminuto.edu.ws.CrearEquipo");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.CrearEquipo) Class.forName("co.uniminuto.edu.ws.CrearEquipo").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.CrearEquipo", instance);
            }
            instance.setEquipo(value);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                5
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
     *  co.uniminuto.edu.ws.CrearEquipo
     */
    public static class co_uniminuto_edu_servlets_CrearEquiposetIddeporte30Gateway implements InvocationAbstraction {

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
            int value = ((Integer) Utility.readObject(input)).intValue();

            co.uniminuto.edu.ws.CrearEquipo instance = (co.uniminuto.edu.ws.CrearEquipo) session.getAttribute("co.uniminuto.edu.ws.CrearEquipo");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.CrearEquipo) Class.forName("co.uniminuto.edu.ws.CrearEquipo").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.CrearEquipo", instance);
            }
            instance.setIddeporte(value);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                11
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
     *  co.uniminuto.edu.ws.CrearEquipo
     */
    public static class co_uniminuto_edu_servlets_CrearEquipogetEquipo27Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.CrearEquipo instance = (co.uniminuto.edu.ws.CrearEquipo) session.getAttribute("co.uniminuto.edu.ws.CrearEquipo");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.CrearEquipo) Class.forName("co.uniminuto.edu.ws.CrearEquipo").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.CrearEquipo", instance);
            }
            return instance.getEquipo();
        }

        public int[] getIds() {
            return new int[]{};
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
     *  co.uniminuto.edu.ws.CrearEquipo
     */
    public static class co_uniminuto_edu_servlets_CrearEquipogetIddeporte29Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.CrearEquipo instance = (co.uniminuto.edu.ws.CrearEquipo) session.getAttribute("co.uniminuto.edu.ws.CrearEquipo");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.CrearEquipo) Class.forName("co.uniminuto.edu.ws.CrearEquipo").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.CrearEquipo", instance);
            }
            return new Integer(instance.getIddeporte());
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
     *  co.uniminuto.edu.ws.ConsultaSaldo
     */
    public static class co_uniminuto_edu_servlets_ConsultaSaldogetIdusuario13Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.ConsultaSaldo instance = (co.uniminuto.edu.ws.ConsultaSaldo) session.getAttribute("co.uniminuto.edu.ws.ConsultaSaldo");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.ConsultaSaldo) Class.forName("co.uniminuto.edu.ws.ConsultaSaldo").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.ConsultaSaldo", instance);
            }
            return new Integer(instance.getIdusuario());
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
     *  co.uniminuto.edu.ws.ConsultaSaldo
     */
    public static class co_uniminuto_edu_servlets_ConsultaSaldosetIdusuario14Gateway implements InvocationAbstraction {

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
            int value = ((Integer) Utility.readObject(input)).intValue();

            co.uniminuto.edu.ws.ConsultaSaldo instance = (co.uniminuto.edu.ws.ConsultaSaldo) session.getAttribute("co.uniminuto.edu.ws.ConsultaSaldo");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.ConsultaSaldo) Class.forName("co.uniminuto.edu.ws.ConsultaSaldo").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.ConsultaSaldo", instance);
            }
            instance.setIdusuario(value);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                11
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
     *  co.uniminuto.edu.ws.Equipows
     */
    public static class co_uniminuto_edu_servlets_EquipowsconsultarEquipo54Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.Equipows instance = (co.uniminuto.edu.ws.Equipows) session.getAttribute("co.uniminuto.edu.ws.Equipows");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Equipows) Class.forName("co.uniminuto.edu.ws.Equipows").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Equipows", instance);
            }
            return instance.consultarEquipo(idequipo);
        }

        public int[] getIds() {
            return new int[]{
                11
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
     *  co.uniminuto.edu.ws.Equipows
     */
    public static class co_uniminuto_edu_servlets_EquipowsverEquipos53Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.Equipows instance = (co.uniminuto.edu.ws.Equipows) session.getAttribute("co.uniminuto.edu.ws.Equipows");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Equipows) Class.forName("co.uniminuto.edu.ws.Equipows").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Equipows", instance);
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
     *  co.uniminuto.edu.ws.Equipows
     */
    public static class co_uniminuto_edu_servlets_EquipowscrearEquipo52Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.Equipows instance = (co.uniminuto.edu.ws.Equipows) session.getAttribute("co.uniminuto.edu.ws.Equipows");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Equipows) Class.forName("co.uniminuto.edu.ws.Equipows").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Equipows", instance);
            }
            instance.crearEquipo(equipo, iddeporte);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                5,
                11
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
     *  co.uniminuto.edu.ws.ActualizarResultado
     */
    public static class co_uniminuto_edu_servlets_ActualizarResultadosetArg02Gateway implements InvocationAbstraction {

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
            int value = ((Integer) Utility.readObject(input)).intValue();

            co.uniminuto.edu.ws.ActualizarResultado instance = (co.uniminuto.edu.ws.ActualizarResultado) session.getAttribute("co.uniminuto.edu.ws.ActualizarResultado");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.ActualizarResultado) Class.forName("co.uniminuto.edu.ws.ActualizarResultado").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.ActualizarResultado", instance);
            }
            instance.setArg0(value);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                11
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
     *  co.uniminuto.edu.ws.ActualizarResultado
     */
    public static class co_uniminuto_edu_servlets_ActualizarResultadogetArg13Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.ActualizarResultado instance = (co.uniminuto.edu.ws.ActualizarResultado) session.getAttribute("co.uniminuto.edu.ws.ActualizarResultado");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.ActualizarResultado) Class.forName("co.uniminuto.edu.ws.ActualizarResultado").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.ActualizarResultado", instance);
            }
            return instance.getArg1();
        }

        public int[] getIds() {
            return new int[]{};
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
     *  co.uniminuto.edu.ws.ActualizarResultado
     */
    public static class co_uniminuto_edu_servlets_ActualizarResultadosetArg14Gateway implements InvocationAbstraction {

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
            String value = (String) Utility.readObject(input);

            co.uniminuto.edu.ws.ActualizarResultado instance = (co.uniminuto.edu.ws.ActualizarResultado) session.getAttribute("co.uniminuto.edu.ws.ActualizarResultado");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.ActualizarResultado) Class.forName("co.uniminuto.edu.ws.ActualizarResultado").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.ActualizarResultado", instance);
            }
            instance.setArg1(value);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                5
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
     *  co.uniminuto.edu.ws.ActualizarResultado
     */
    public static class co_uniminuto_edu_servlets_ActualizarResultadogetArg01Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.ActualizarResultado instance = (co.uniminuto.edu.ws.ActualizarResultado) session.getAttribute("co.uniminuto.edu.ws.ActualizarResultado");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.ActualizarResultado) Class.forName("co.uniminuto.edu.ws.ActualizarResultado").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.ActualizarResultado", instance);
            }
            return new Integer(instance.getArg0());
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
     *  co.uniminuto.edu.ws.ConsultaUsuario
     */
    public static class co_uniminuto_edu_servlets_ConsultaUsuariogetIdusuario17Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.ConsultaUsuario instance = (co.uniminuto.edu.ws.ConsultaUsuario) session.getAttribute("co.uniminuto.edu.ws.ConsultaUsuario");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.ConsultaUsuario) Class.forName("co.uniminuto.edu.ws.ConsultaUsuario").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.ConsultaUsuario", instance);
            }
            return new Integer(instance.getIdusuario());
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
     *  co.uniminuto.edu.ws.ConsultaUsuario
     */
    public static class co_uniminuto_edu_servlets_ConsultaUsuariosetIdusuario18Gateway implements InvocationAbstraction {

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
            int value = ((Integer) Utility.readObject(input)).intValue();

            co.uniminuto.edu.ws.ConsultaUsuario instance = (co.uniminuto.edu.ws.ConsultaUsuario) session.getAttribute("co.uniminuto.edu.ws.ConsultaUsuario");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.ConsultaUsuario) Class.forName("co.uniminuto.edu.ws.ConsultaUsuario").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.ConsultaUsuario", instance);
            }
            instance.setIdusuario(value);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                11
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
     *  co.uniminuto.edu.ws.Deporte
     */
    public static class co_uniminuto_edu_servlets_DeportesetIddeporte42Gateway implements InvocationAbstraction {

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
            Integer value = (Integer) Utility.readObject(input);

            co.uniminuto.edu.ws.Deporte instance = (co.uniminuto.edu.ws.Deporte) session.getAttribute("co.uniminuto.edu.ws.Deporte");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Deporte) Class.forName("co.uniminuto.edu.ws.Deporte").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Deporte", instance);
            }
            instance.setIddeporte(value);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                7
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
     *  co.uniminuto.edu.ws.Deporte
     */
    public static class co_uniminuto_edu_servlets_DeportesetDeporte40Gateway implements InvocationAbstraction {

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
            String value = (String) Utility.readObject(input);

            co.uniminuto.edu.ws.Deporte instance = (co.uniminuto.edu.ws.Deporte) session.getAttribute("co.uniminuto.edu.ws.Deporte");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Deporte) Class.forName("co.uniminuto.edu.ws.Deporte").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Deporte", instance);
            }
            instance.setDeporte(value);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                5
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
     *  co.uniminuto.edu.ws.Deporte
     */
    public static class co_uniminuto_edu_servlets_DeportegetIddeporte41Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.Deporte instance = (co.uniminuto.edu.ws.Deporte) session.getAttribute("co.uniminuto.edu.ws.Deporte");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Deporte) Class.forName("co.uniminuto.edu.ws.Deporte").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Deporte", instance);
            }
            return instance.getIddeporte();
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
     *  co.uniminuto.edu.ws.Deporte
     */
    public static class co_uniminuto_edu_servlets_DeportegetDeporte39Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.Deporte instance = (co.uniminuto.edu.ws.Deporte) session.getAttribute("co.uniminuto.edu.ws.Deporte");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Deporte) Class.forName("co.uniminuto.edu.ws.Deporte").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Deporte", instance);
            }
            return instance.getDeporte();
        }

        public int[] getIds() {
            return new int[]{};
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
     *  co.uniminuto.edu.ws.ConsultaPartido
     */
    public static class co_uniminuto_edu_servlets_ConsultaPartidogetArg09Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.ConsultaPartido instance = (co.uniminuto.edu.ws.ConsultaPartido) session.getAttribute("co.uniminuto.edu.ws.ConsultaPartido");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.ConsultaPartido) Class.forName("co.uniminuto.edu.ws.ConsultaPartido").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.ConsultaPartido", instance);
            }
            return new Integer(instance.getArg0());
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
     *  co.uniminuto.edu.ws.ConsultaPartido
     */
    public static class co_uniminuto_edu_servlets_ConsultaPartidosetArg010Gateway implements InvocationAbstraction {

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
            int value = ((Integer) Utility.readObject(input)).intValue();

            co.uniminuto.edu.ws.ConsultaPartido instance = (co.uniminuto.edu.ws.ConsultaPartido) session.getAttribute("co.uniminuto.edu.ws.ConsultaPartido");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.ConsultaPartido) Class.forName("co.uniminuto.edu.ws.ConsultaPartido").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.ConsultaPartido", instance);
            }
            instance.setArg0(value);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                11
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
     *  co.uniminuto.edu.ws.ConsultarEquipo
     */
    public static class co_uniminuto_edu_servlets_ConsultarEquiposetIdequipo22Gateway implements InvocationAbstraction {

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
            int value = ((Integer) Utility.readObject(input)).intValue();

            co.uniminuto.edu.ws.ConsultarEquipo instance = (co.uniminuto.edu.ws.ConsultarEquipo) session.getAttribute("co.uniminuto.edu.ws.ConsultarEquipo");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.ConsultarEquipo) Class.forName("co.uniminuto.edu.ws.ConsultarEquipo").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.ConsultarEquipo", instance);
            }
            instance.setIdequipo(value);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                11
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
     *  co.uniminuto.edu.ws.ConsultarEquipo
     */
    public static class co_uniminuto_edu_servlets_ConsultarEquipogetIdequipo21Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.ConsultarEquipo instance = (co.uniminuto.edu.ws.ConsultarEquipo) session.getAttribute("co.uniminuto.edu.ws.ConsultarEquipo");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.ConsultarEquipo) Class.forName("co.uniminuto.edu.ws.ConsultarEquipo").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.ConsultarEquipo", instance);
            }
            return new Integer(instance.getIdequipo());
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
     *  co.uniminuto.edu.ws.SumarValor
     */
    public static class co_uniminuto_edu_servlets_SumarValorsetIdusuario103Gateway implements InvocationAbstraction {

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
            int value = ((Integer) Utility.readObject(input)).intValue();

            co.uniminuto.edu.ws.SumarValor instance = (co.uniminuto.edu.ws.SumarValor) session.getAttribute("co.uniminuto.edu.ws.SumarValor");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.SumarValor) Class.forName("co.uniminuto.edu.ws.SumarValor").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.SumarValor", instance);
            }
            instance.setIdusuario(value);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                11
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
     *  co.uniminuto.edu.ws.SumarValor
     */
    public static class co_uniminuto_edu_servlets_SumarValorgetIdusuario102Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.SumarValor instance = (co.uniminuto.edu.ws.SumarValor) session.getAttribute("co.uniminuto.edu.ws.SumarValor");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.SumarValor) Class.forName("co.uniminuto.edu.ws.SumarValor").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.SumarValor", instance);
            }
            return new Integer(instance.getIdusuario());
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
     *  co.uniminuto.edu.ws.SumarValor
     */
    public static class co_uniminuto_edu_servlets_SumarValorgetValor104Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.SumarValor instance = (co.uniminuto.edu.ws.SumarValor) session.getAttribute("co.uniminuto.edu.ws.SumarValor");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.SumarValor) Class.forName("co.uniminuto.edu.ws.SumarValor").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.SumarValor", instance);
            }
            return instance.getValor();
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
     *  co.uniminuto.edu.ws.SumarValor
     */
    public static class co_uniminuto_edu_servlets_SumarValorsetValor105Gateway implements InvocationAbstraction {

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
            Integer value = (Integer) Utility.readObject(input);

            co.uniminuto.edu.ws.SumarValor instance = (co.uniminuto.edu.ws.SumarValor) session.getAttribute("co.uniminuto.edu.ws.SumarValor");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.SumarValor) Class.forName("co.uniminuto.edu.ws.SumarValor").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.SumarValor", instance);
            }
            instance.setValor(value);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                7
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
     *  co.uniminuto.edu.ws.ObjectFactory
     */
    public static class co_uniminuto_edu_servlets_ObjectFactorycreateConsultaSaldoResponse65Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.ObjectFactory instance = (co.uniminuto.edu.ws.ObjectFactory) session.getAttribute("co.uniminuto.edu.ws.ObjectFactory");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.ObjectFactory) Class.forName("co.uniminuto.edu.ws.ObjectFactory").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.ObjectFactory", instance);
            }
            return instance.createConsultaSaldoResponse();
        }

        public int[] getIds() {
            return new int[]{};
        }

        ;

        public int[] getReturnIds() {
            return new int[]{
                1
            };
        }
    ;

    }
    /**
     *  This class implements the application server connectivity specific to the needs.
     *  co.uniminuto.edu.ws.ObjectFactory
     */
    public static class co_uniminuto_edu_servlets_ObjectFactorycreateConsultaSaldo64Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.ObjectFactory instance = (co.uniminuto.edu.ws.ObjectFactory) session.getAttribute("co.uniminuto.edu.ws.ObjectFactory");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.ObjectFactory) Class.forName("co.uniminuto.edu.ws.ObjectFactory").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.ObjectFactory", instance);
            }
            return instance.createConsultaSaldo();
        }

        public int[] getIds() {
            return new int[]{};
        }

        ;

        public int[] getReturnIds() {
            return new int[]{
                17
            };
        }
    ;

    }
    /**
     *  This class implements the application server connectivity specific to the needs.
     *  co.uniminuto.edu.ws.ObjectFactory
     */
    public static class co_uniminuto_edu_servlets_ObjectFactorycreateRestarValor69Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.ObjectFactory instance = (co.uniminuto.edu.ws.ObjectFactory) session.getAttribute("co.uniminuto.edu.ws.ObjectFactory");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.ObjectFactory) Class.forName("co.uniminuto.edu.ws.ObjectFactory").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.ObjectFactory", instance);
            }
            return instance.createRestarValor();
        }

        public int[] getIds() {
            return new int[]{};
        }

        ;

        public int[] getReturnIds() {
            return new int[]{
                2
            };
        }
    ;

    }
    /**
     *  This class implements the application server connectivity specific to the needs.
     *  co.uniminuto.edu.ws.ObjectFactory
     */
    public static class co_uniminuto_edu_servlets_ObjectFactorycreateConsultaUsuario67Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.ObjectFactory instance = (co.uniminuto.edu.ws.ObjectFactory) session.getAttribute("co.uniminuto.edu.ws.ObjectFactory");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.ObjectFactory) Class.forName("co.uniminuto.edu.ws.ObjectFactory").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.ObjectFactory", instance);
            }
            return instance.createConsultaUsuario();
        }

        public int[] getIds() {
            return new int[]{};
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
     *  co.uniminuto.edu.ws.ObjectFactory
     */
    public static class co_uniminuto_edu_servlets_ObjectFactorycreateSumarValor71Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.ObjectFactory instance = (co.uniminuto.edu.ws.ObjectFactory) session.getAttribute("co.uniminuto.edu.ws.ObjectFactory");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.ObjectFactory) Class.forName("co.uniminuto.edu.ws.ObjectFactory").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.ObjectFactory", instance);
            }
            return instance.createSumarValor();
        }

        public int[] getIds() {
            return new int[]{};
        }

        ;

        public int[] getReturnIds() {
            return new int[]{
                19
            };
        }
    ;

    }
    /**
     *  This class implements the application server connectivity specific to the needs.
     *  co.uniminuto.edu.ws.ObjectFactory
     */
    public static class co_uniminuto_edu_servlets_ObjectFactorycreateConsultaUsuarioResponse68Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.ObjectFactory instance = (co.uniminuto.edu.ws.ObjectFactory) session.getAttribute("co.uniminuto.edu.ws.ObjectFactory");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.ObjectFactory) Class.forName("co.uniminuto.edu.ws.ObjectFactory").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.ObjectFactory", instance);
            }
            return instance.createConsultaUsuarioResponse();
        }

        public int[] getIds() {
            return new int[]{};
        }

        ;

        public int[] getReturnIds() {
            return new int[]{
                16
            };
        }
    ;

    }
    /**
     *  This class implements the application server connectivity specific to the needs.
     *  co.uniminuto.edu.ws.ObjectFactory
     */
    public static class co_uniminuto_edu_servlets_ObjectFactorycreateUsuario63Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.ObjectFactory instance = (co.uniminuto.edu.ws.ObjectFactory) session.getAttribute("co.uniminuto.edu.ws.ObjectFactory");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.ObjectFactory) Class.forName("co.uniminuto.edu.ws.ObjectFactory").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.ObjectFactory", instance);
            }
            return instance.createUsuario();
        }

        public int[] getIds() {
            return new int[]{};
        }

        ;

        public int[] getReturnIds() {
            return new int[]{
                6
            };
        }
    ;

    }
    /**
     *  This class implements the application server connectivity specific to the needs.
     *  co.uniminuto.edu.ws.ObjectFactory
     */
    public static class co_uniminuto_edu_servlets_ObjectFactorycreateRegistroResponse70Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.ObjectFactory instance = (co.uniminuto.edu.ws.ObjectFactory) session.getAttribute("co.uniminuto.edu.ws.ObjectFactory");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.ObjectFactory) Class.forName("co.uniminuto.edu.ws.ObjectFactory").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.ObjectFactory", instance);
            }
            return instance.createRegistroResponse();
        }

        public int[] getIds() {
            return new int[]{};
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
     *  co.uniminuto.edu.ws.ObjectFactory
     */
    public static class co_uniminuto_edu_servlets_ObjectFactorycreateRegistro66Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.ObjectFactory instance = (co.uniminuto.edu.ws.ObjectFactory) session.getAttribute("co.uniminuto.edu.ws.ObjectFactory");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.ObjectFactory) Class.forName("co.uniminuto.edu.ws.ObjectFactory").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.ObjectFactory", instance);
            }
            return instance.createRegistro();
        }

        public int[] getIds() {
            return new int[]{};
        }

        ;

        public int[] getReturnIds() {
            return new int[]{
                20
            };
        }
    ;

    }
    /**
     *  This class implements the application server connectivity specific to the needs.
     *  co.uniminuto.edu.ws.CrearPartido
     */
    public static class co_uniminuto_edu_servlets_CrearPartidosetLocal36Gateway implements InvocationAbstraction {

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
            int value = ((Integer) Utility.readObject(input)).intValue();

            co.uniminuto.edu.ws.CrearPartido instance = (co.uniminuto.edu.ws.CrearPartido) session.getAttribute("co.uniminuto.edu.ws.CrearPartido");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.CrearPartido) Class.forName("co.uniminuto.edu.ws.CrearPartido").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.CrearPartido", instance);
            }
            instance.setLocal(value);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                11
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
     *  co.uniminuto.edu.ws.CrearPartido
     */
    public static class co_uniminuto_edu_servlets_CrearPartidogetVisita37Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.CrearPartido instance = (co.uniminuto.edu.ws.CrearPartido) session.getAttribute("co.uniminuto.edu.ws.CrearPartido");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.CrearPartido) Class.forName("co.uniminuto.edu.ws.CrearPartido").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.CrearPartido", instance);
            }
            return new Integer(instance.getVisita());
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
     *  co.uniminuto.edu.ws.CrearPartido
     */
    public static class co_uniminuto_edu_servlets_CrearPartidogetResultado33Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.CrearPartido instance = (co.uniminuto.edu.ws.CrearPartido) session.getAttribute("co.uniminuto.edu.ws.CrearPartido");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.CrearPartido) Class.forName("co.uniminuto.edu.ws.CrearPartido").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.CrearPartido", instance);
            }
            return instance.getResultado();
        }

        public int[] getIds() {
            return new int[]{};
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
     *  co.uniminuto.edu.ws.CrearPartido
     */
    public static class co_uniminuto_edu_servlets_CrearPartidosetResultado34Gateway implements InvocationAbstraction {

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
            String value = (String) Utility.readObject(input);

            co.uniminuto.edu.ws.CrearPartido instance = (co.uniminuto.edu.ws.CrearPartido) session.getAttribute("co.uniminuto.edu.ws.CrearPartido");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.CrearPartido) Class.forName("co.uniminuto.edu.ws.CrearPartido").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.CrearPartido", instance);
            }
            instance.setResultado(value);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                5
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
     *  co.uniminuto.edu.ws.CrearPartido
     */
    public static class co_uniminuto_edu_servlets_CrearPartidogetFecha31Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.CrearPartido instance = (co.uniminuto.edu.ws.CrearPartido) session.getAttribute("co.uniminuto.edu.ws.CrearPartido");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.CrearPartido) Class.forName("co.uniminuto.edu.ws.CrearPartido").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.CrearPartido", instance);
            }
            return instance.getFecha();
        }

        public int[] getIds() {
            return new int[]{};
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
     *  co.uniminuto.edu.ws.CrearPartido
     */
    public static class co_uniminuto_edu_servlets_CrearPartidosetFecha32Gateway implements InvocationAbstraction {

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
            String value = (String) Utility.readObject(input);

            co.uniminuto.edu.ws.CrearPartido instance = (co.uniminuto.edu.ws.CrearPartido) session.getAttribute("co.uniminuto.edu.ws.CrearPartido");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.CrearPartido) Class.forName("co.uniminuto.edu.ws.CrearPartido").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.CrearPartido", instance);
            }
            instance.setFecha(value);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                5
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
     *  co.uniminuto.edu.ws.CrearPartido
     */
    public static class co_uniminuto_edu_servlets_CrearPartidosetVisita38Gateway implements InvocationAbstraction {

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
            int value = ((Integer) Utility.readObject(input)).intValue();

            co.uniminuto.edu.ws.CrearPartido instance = (co.uniminuto.edu.ws.CrearPartido) session.getAttribute("co.uniminuto.edu.ws.CrearPartido");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.CrearPartido) Class.forName("co.uniminuto.edu.ws.CrearPartido").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.CrearPartido", instance);
            }
            instance.setVisita(value);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                11
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
     *  co.uniminuto.edu.ws.CrearPartido
     */
    public static class co_uniminuto_edu_servlets_CrearPartidogetLocal35Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.CrearPartido instance = (co.uniminuto.edu.ws.CrearPartido) session.getAttribute("co.uniminuto.edu.ws.CrearPartido");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.CrearPartido) Class.forName("co.uniminuto.edu.ws.CrearPartido").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.CrearPartido", instance);
            }
            return new Integer(instance.getLocal());
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
     *  co.uniminuto.edu.ws.ConsultaDeporte
     */
    public static class co_uniminuto_edu_servlets_ConsultaDeportegetIddeporte5Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.ConsultaDeporte instance = (co.uniminuto.edu.ws.ConsultaDeporte) session.getAttribute("co.uniminuto.edu.ws.ConsultaDeporte");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.ConsultaDeporte) Class.forName("co.uniminuto.edu.ws.ConsultaDeporte").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.ConsultaDeporte", instance);
            }
            return new Integer(instance.getIddeporte());
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
     *  co.uniminuto.edu.ws.ConsultaDeporte
     */
    public static class co_uniminuto_edu_servlets_ConsultaDeportesetIddeporte6Gateway implements InvocationAbstraction {

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
            int value = ((Integer) Utility.readObject(input)).intValue();

            co.uniminuto.edu.ws.ConsultaDeporte instance = (co.uniminuto.edu.ws.ConsultaDeporte) session.getAttribute("co.uniminuto.edu.ws.ConsultaDeporte");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.ConsultaDeporte) Class.forName("co.uniminuto.edu.ws.ConsultaDeporte").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.ConsultaDeporte", instance);
            }
            instance.setIddeporte(value);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                11
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
     *  co.uniminuto.edu.ws.RestarValor
     */
    public static class co_uniminuto_edu_servlets_RestarValorgetValor100Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.RestarValor instance = (co.uniminuto.edu.ws.RestarValor) session.getAttribute("co.uniminuto.edu.ws.RestarValor");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.RestarValor) Class.forName("co.uniminuto.edu.ws.RestarValor").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.RestarValor", instance);
            }
            return instance.getValor();
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
     *  co.uniminuto.edu.ws.RestarValor
     */
    public static class co_uniminuto_edu_servlets_RestarValorsetValor101Gateway implements InvocationAbstraction {

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
            Integer value = (Integer) Utility.readObject(input);

            co.uniminuto.edu.ws.RestarValor instance = (co.uniminuto.edu.ws.RestarValor) session.getAttribute("co.uniminuto.edu.ws.RestarValor");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.RestarValor) Class.forName("co.uniminuto.edu.ws.RestarValor").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.RestarValor", instance);
            }
            instance.setValor(value);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                7
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
     *  co.uniminuto.edu.ws.RestarValor
     */
    public static class co_uniminuto_edu_servlets_RestarValorgetIdusuario98Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.RestarValor instance = (co.uniminuto.edu.ws.RestarValor) session.getAttribute("co.uniminuto.edu.ws.RestarValor");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.RestarValor) Class.forName("co.uniminuto.edu.ws.RestarValor").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.RestarValor", instance);
            }
            return new Integer(instance.getIdusuario());
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
     *  co.uniminuto.edu.ws.RestarValor
     */
    public static class co_uniminuto_edu_servlets_RestarValorsetIdusuario99Gateway implements InvocationAbstraction {

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
            int value = ((Integer) Utility.readObject(input)).intValue();

            co.uniminuto.edu.ws.RestarValor instance = (co.uniminuto.edu.ws.RestarValor) session.getAttribute("co.uniminuto.edu.ws.RestarValor");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.RestarValor) Class.forName("co.uniminuto.edu.ws.RestarValor").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.RestarValor", instance);
            }
            instance.setIdusuario(value);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                11
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
     *  co.uniminuto.edu.ws.Deportews
     */
    public static class co_uniminuto_edu_servlets_DeportewscrearDeporte43Gateway implements InvocationAbstraction {

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
            String deporte = (String) Utility.readObject(input);

            co.uniminuto.edu.ws.Deportews instance = (co.uniminuto.edu.ws.Deportews) session.getAttribute("co.uniminuto.edu.ws.Deportews");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Deportews) Class.forName("co.uniminuto.edu.ws.Deportews").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Deportews", instance);
            }
            instance.crearDeporte(deporte);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                5
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
     *  co.uniminuto.edu.ws.Deportews
     */
    public static class co_uniminuto_edu_servlets_DeportewsverDeportes45Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.Deportews instance = (co.uniminuto.edu.ws.Deportews) session.getAttribute("co.uniminuto.edu.ws.Deportews");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Deportews) Class.forName("co.uniminuto.edu.ws.Deportews").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Deportews", instance);
            }
            return instance.verDeportes();
        }

        public int[] getIds() {
            return new int[]{};
        }

        ;

        public int[] getReturnIds() {
            return new int[]{
                10
            };
        }
    ;

    }
    /**
     *  This class implements the application server connectivity specific to the needs.
     *  co.uniminuto.edu.ws.Deportews
     */
    public static class co_uniminuto_edu_servlets_DeportewsconsultaDeporte44Gateway implements InvocationAbstraction {

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
            int iddeporte = ((Integer) Utility.readObject(input)).intValue();

            co.uniminuto.edu.ws.Deportews instance = (co.uniminuto.edu.ws.Deportews) session.getAttribute("co.uniminuto.edu.ws.Deportews");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Deportews) Class.forName("co.uniminuto.edu.ws.Deportews").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Deportews", instance);
            }
            return instance.consultaDeporte(iddeporte);
        }

        public int[] getIds() {
            return new int[]{
                11
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
     *  co.uniminuto.edu.ws.ConsultaPartidoResponse
     */
    public static class co_uniminuto_edu_servlets_ConsultaPartidoResponsesetReturn12Gateway implements InvocationAbstraction {

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
            co.uniminuto.edu.ws.Partido value = (co.uniminuto.edu.ws.Partido) Utility.readObject(input);

            co.uniminuto.edu.ws.ConsultaPartidoResponse instance = (co.uniminuto.edu.ws.ConsultaPartidoResponse) session.getAttribute("co.uniminuto.edu.ws.ConsultaPartidoResponse");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.ConsultaPartidoResponse) Class.forName("co.uniminuto.edu.ws.ConsultaPartidoResponse").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.ConsultaPartidoResponse", instance);
            }
            instance.setReturn(value);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                3
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
     *  co.uniminuto.edu.ws.ConsultaPartidoResponse
     */
    public static class co_uniminuto_edu_servlets_ConsultaPartidoResponsegetReturn11Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.ConsultaPartidoResponse instance = (co.uniminuto.edu.ws.ConsultaPartidoResponse) session.getAttribute("co.uniminuto.edu.ws.ConsultaPartidoResponse");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.ConsultaPartidoResponse) Class.forName("co.uniminuto.edu.ws.ConsultaPartidoResponse").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.ConsultaPartidoResponse", instance);
            }
            return instance.getReturn();
        }

        public int[] getIds() {
            return new int[]{};
        }

        ;

        public int[] getReturnIds() {
            return new int[]{
                3
            };
        }
    ;

    }
    /**
     *  This class implements the application server connectivity specific to the needs.
     *  co.uniminuto.edu.ws.Usuario
     */
    public static class co_uniminuto_edu_servlets_UsuariosetNombre113Gateway implements InvocationAbstraction {

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
            String value = (String) Utility.readObject(input);

            co.uniminuto.edu.ws.Usuario instance = (co.uniminuto.edu.ws.Usuario) session.getAttribute("co.uniminuto.edu.ws.Usuario");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Usuario) Class.forName("co.uniminuto.edu.ws.Usuario").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Usuario", instance);
            }
            instance.setNombre(value);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                5
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
     *  co.uniminuto.edu.ws.Usuario
     */
    public static class co_uniminuto_edu_servlets_UsuariosetTelefono121Gateway implements InvocationAbstraction {

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
            String value = (String) Utility.readObject(input);

            co.uniminuto.edu.ws.Usuario instance = (co.uniminuto.edu.ws.Usuario) session.getAttribute("co.uniminuto.edu.ws.Usuario");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Usuario) Class.forName("co.uniminuto.edu.ws.Usuario").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Usuario", instance);
            }
            instance.setTelefono(value);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                5
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
     *  co.uniminuto.edu.ws.Usuario
     */
    public static class co_uniminuto_edu_servlets_UsuariosetApellido107Gateway implements InvocationAbstraction {

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
            String value = (String) Utility.readObject(input);

            co.uniminuto.edu.ws.Usuario instance = (co.uniminuto.edu.ws.Usuario) session.getAttribute("co.uniminuto.edu.ws.Usuario");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Usuario) Class.forName("co.uniminuto.edu.ws.Usuario").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Usuario", instance);
            }
            instance.setApellido(value);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                5
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
     *  co.uniminuto.edu.ws.Usuario
     */
    public static class co_uniminuto_edu_servlets_UsuariosetSaldo119Gateway implements InvocationAbstraction {

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
            Integer value = (Integer) Utility.readObject(input);

            co.uniminuto.edu.ws.Usuario instance = (co.uniminuto.edu.ws.Usuario) session.getAttribute("co.uniminuto.edu.ws.Usuario");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Usuario) Class.forName("co.uniminuto.edu.ws.Usuario").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Usuario", instance);
            }
            instance.setSaldo(value);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                7
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
     *  co.uniminuto.edu.ws.Usuario
     */
    public static class co_uniminuto_edu_servlets_UsuariogetApellido106Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.Usuario instance = (co.uniminuto.edu.ws.Usuario) session.getAttribute("co.uniminuto.edu.ws.Usuario");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Usuario) Class.forName("co.uniminuto.edu.ws.Usuario").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Usuario", instance);
            }
            return instance.getApellido();
        }

        public int[] getIds() {
            return new int[]{};
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
     *  co.uniminuto.edu.ws.Usuario
     */
    public static class co_uniminuto_edu_servlets_UsuariosetIdusuario111Gateway implements InvocationAbstraction {

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
            int value = ((Integer) Utility.readObject(input)).intValue();

            co.uniminuto.edu.ws.Usuario instance = (co.uniminuto.edu.ws.Usuario) session.getAttribute("co.uniminuto.edu.ws.Usuario");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Usuario) Class.forName("co.uniminuto.edu.ws.Usuario").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Usuario", instance);
            }
            instance.setIdusuario(value);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                11
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
     *  co.uniminuto.edu.ws.Usuario
     */
    public static class co_uniminuto_edu_servlets_UsuariogetTelefono120Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.Usuario instance = (co.uniminuto.edu.ws.Usuario) session.getAttribute("co.uniminuto.edu.ws.Usuario");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Usuario) Class.forName("co.uniminuto.edu.ws.Usuario").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Usuario", instance);
            }
            return instance.getTelefono();
        }

        public int[] getIds() {
            return new int[]{};
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
     *  co.uniminuto.edu.ws.Usuario
     */
    public static class co_uniminuto_edu_servlets_UsuariogetNombre112Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.Usuario instance = (co.uniminuto.edu.ws.Usuario) session.getAttribute("co.uniminuto.edu.ws.Usuario");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Usuario) Class.forName("co.uniminuto.edu.ws.Usuario").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Usuario", instance);
            }
            return instance.getNombre();
        }

        public int[] getIds() {
            return new int[]{};
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
     *  co.uniminuto.edu.ws.Usuario
     */
    public static class co_uniminuto_edu_servlets_UsuariogetCorreo108Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.Usuario instance = (co.uniminuto.edu.ws.Usuario) session.getAttribute("co.uniminuto.edu.ws.Usuario");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Usuario) Class.forName("co.uniminuto.edu.ws.Usuario").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Usuario", instance);
            }
            return instance.getCorreo();
        }

        public int[] getIds() {
            return new int[]{};
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
     *  co.uniminuto.edu.ws.Usuario
     */
    public static class co_uniminuto_edu_servlets_UsuariosetRol117Gateway implements InvocationAbstraction {

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
            Byte value = (Byte) Utility.readObject(input);

            co.uniminuto.edu.ws.Usuario instance = (co.uniminuto.edu.ws.Usuario) session.getAttribute("co.uniminuto.edu.ws.Usuario");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Usuario) Class.forName("co.uniminuto.edu.ws.Usuario").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Usuario", instance);
            }
            instance.setRol(value);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                15
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
     *  co.uniminuto.edu.ws.Usuario
     */
    public static class co_uniminuto_edu_servlets_UsuariosetCorreo109Gateway implements InvocationAbstraction {

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
            String value = (String) Utility.readObject(input);

            co.uniminuto.edu.ws.Usuario instance = (co.uniminuto.edu.ws.Usuario) session.getAttribute("co.uniminuto.edu.ws.Usuario");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Usuario) Class.forName("co.uniminuto.edu.ws.Usuario").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Usuario", instance);
            }
            instance.setCorreo(value);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                5
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
     *  co.uniminuto.edu.ws.Usuario
     */
    public static class co_uniminuto_edu_servlets_UsuariogetRol116Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.Usuario instance = (co.uniminuto.edu.ws.Usuario) session.getAttribute("co.uniminuto.edu.ws.Usuario");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Usuario) Class.forName("co.uniminuto.edu.ws.Usuario").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Usuario", instance);
            }
            return instance.getRol();
        }

        public int[] getIds() {
            return new int[]{};
        }

        ;

        public int[] getReturnIds() {
            return new int[]{
                15
            };
        }
    ;

    }
    /**
     *  This class implements the application server connectivity specific to the needs.
     *  co.uniminuto.edu.ws.Usuario
     */
    public static class co_uniminuto_edu_servlets_UsuariogetSaldo118Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.Usuario instance = (co.uniminuto.edu.ws.Usuario) session.getAttribute("co.uniminuto.edu.ws.Usuario");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Usuario) Class.forName("co.uniminuto.edu.ws.Usuario").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Usuario", instance);
            }
            return instance.getSaldo();
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
     *  co.uniminuto.edu.ws.Usuario
     */
    public static class co_uniminuto_edu_servlets_UsuariogetIdusuario110Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.Usuario instance = (co.uniminuto.edu.ws.Usuario) session.getAttribute("co.uniminuto.edu.ws.Usuario");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Usuario) Class.forName("co.uniminuto.edu.ws.Usuario").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Usuario", instance);
            }
            return new Integer(instance.getIdusuario());
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
     *  co.uniminuto.edu.ws.Usuario
     */
    public static class co_uniminuto_edu_servlets_UsuariogetPassword114Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.Usuario instance = (co.uniminuto.edu.ws.Usuario) session.getAttribute("co.uniminuto.edu.ws.Usuario");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Usuario) Class.forName("co.uniminuto.edu.ws.Usuario").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Usuario", instance);
            }
            return instance.getPassword();
        }

        public int[] getIds() {
            return new int[]{};
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
     *  co.uniminuto.edu.ws.Usuario
     */
    public static class co_uniminuto_edu_servlets_UsuariosetPassword115Gateway implements InvocationAbstraction {

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
            String value = (String) Utility.readObject(input);

            co.uniminuto.edu.ws.Usuario instance = (co.uniminuto.edu.ws.Usuario) session.getAttribute("co.uniminuto.edu.ws.Usuario");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Usuario) Class.forName("co.uniminuto.edu.ws.Usuario").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Usuario", instance);
            }
            instance.setPassword(value);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                5
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
     *  co.uniminuto.edu.ws.Partidows
     */
    public static class co_uniminuto_edu_servlets_PartidowsconsultaPartido82Gateway implements InvocationAbstraction {

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
            int arg0 = ((Integer) Utility.readObject(input)).intValue();

            co.uniminuto.edu.ws.Partidows instance = (co.uniminuto.edu.ws.Partidows) session.getAttribute("co.uniminuto.edu.ws.Partidows");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Partidows) Class.forName("co.uniminuto.edu.ws.Partidows").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Partidows", instance);
            }
            return instance.consultaPartido(arg0);
        }

        public int[] getIds() {
            return new int[]{
                11
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
    /**
     *  This class implements the application server connectivity specific to the needs.
     *  co.uniminuto.edu.ws.Partidows
     */
    public static class co_uniminuto_edu_servlets_PartidowsactualizarResultado80Gateway implements InvocationAbstraction {

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
            int arg0 = ((Integer) Utility.readObject(input)).intValue();
            String arg1 = (String) Utility.readObject(input);

            co.uniminuto.edu.ws.Partidows instance = (co.uniminuto.edu.ws.Partidows) session.getAttribute("co.uniminuto.edu.ws.Partidows");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Partidows) Class.forName("co.uniminuto.edu.ws.Partidows").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Partidows", instance);
            }
            instance.actualizarResultado(arg0, arg1);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                11,
                5
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
     *  co.uniminuto.edu.ws.Partidows
     */
    public static class co_uniminuto_edu_servlets_PartidowscrearPartido81Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.Partidows instance = (co.uniminuto.edu.ws.Partidows) session.getAttribute("co.uniminuto.edu.ws.Partidows");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Partidows) Class.forName("co.uniminuto.edu.ws.Partidows").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Partidows", instance);
            }
            instance.crearPartido(fecha, resultado, local, visita);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                5,
                5,
                11,
                11
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
     *  co.uniminuto.edu.ws.Partidows
     */
    public static class co_uniminuto_edu_servlets_PartidowsverPartidosApostar84Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.Partidows instance = (co.uniminuto.edu.ws.Partidows) session.getAttribute("co.uniminuto.edu.ws.Partidows");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Partidows) Class.forName("co.uniminuto.edu.ws.Partidows").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Partidows", instance);
            }
            return instance.verPartidosApostar();
        }

        public int[] getIds() {
            return new int[]{};
        }

        ;

        public int[] getReturnIds() {
            return new int[]{
                9
            };
        }
    ;

    }
    /**
     *  This class implements the application server connectivity specific to the needs.
     *  co.uniminuto.edu.ws.Partidows
     */
    public static class co_uniminuto_edu_servlets_PartidowsverPartidos85Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.Partidows instance = (co.uniminuto.edu.ws.Partidows) session.getAttribute("co.uniminuto.edu.ws.Partidows");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Partidows) Class.forName("co.uniminuto.edu.ws.Partidows").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Partidows", instance);
            }
            return instance.verPartidos();
        }

        public int[] getIds() {
            return new int[]{};
        }

        ;

        public int[] getReturnIds() {
            return new int[]{
                9
            };
        }
    ;

    }
    /**
     *  This class implements the application server connectivity specific to the needs.
     *  co.uniminuto.edu.ws.Partidows
     */
    public static class co_uniminuto_edu_servlets_PartidowsverPartidosActualizar83Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.Partidows instance = (co.uniminuto.edu.ws.Partidows) session.getAttribute("co.uniminuto.edu.ws.Partidows");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.Partidows) Class.forName("co.uniminuto.edu.ws.Partidows").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.Partidows", instance);
            }
            return instance.verPartidosActualizar();
        }

        public int[] getIds() {
            return new int[]{};
        }

        ;

        public int[] getReturnIds() {
            return new int[]{
                9
            };
        }
    ;

    }
    /**
     *  This class implements the application server connectivity specific to the needs.
     *  co.uniminuto.edu.ws.VerPartidosActualizarResponse
     */
    public static class co_uniminuto_edu_servlets_VerPartidosActualizarResponsegetReturn129Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.VerPartidosActualizarResponse instance = (co.uniminuto.edu.ws.VerPartidosActualizarResponse) session.getAttribute("co.uniminuto.edu.ws.VerPartidosActualizarResponse");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.VerPartidosActualizarResponse) Class.forName("co.uniminuto.edu.ws.VerPartidosActualizarResponse").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.VerPartidosActualizarResponse", instance);
            }
            return instance.getReturn();
        }

        public int[] getIds() {
            return new int[]{};
        }

        ;

        public int[] getReturnIds() {
            return new int[]{
                9
            };
        }
    ;

    }
    /**
     *  This class implements the application server connectivity specific to the needs.
     *  co.uniminuto.edu.ws.ConsultaSaldoResponse
     */
    public static class co_uniminuto_edu_servlets_ConsultaSaldoResponsesetReturn16Gateway implements InvocationAbstraction {

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
            Integer value = (Integer) Utility.readObject(input);

            co.uniminuto.edu.ws.ConsultaSaldoResponse instance = (co.uniminuto.edu.ws.ConsultaSaldoResponse) session.getAttribute("co.uniminuto.edu.ws.ConsultaSaldoResponse");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.ConsultaSaldoResponse) Class.forName("co.uniminuto.edu.ws.ConsultaSaldoResponse").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.ConsultaSaldoResponse", instance);
            }
            instance.setReturn(value);
            return Utility.VOID_VALUE;
        }

        public int[] getIds() {
            return new int[]{
                7
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
     *  co.uniminuto.edu.ws.ConsultaSaldoResponse
     */
    public static class co_uniminuto_edu_servlets_ConsultaSaldoResponsegetReturn15Gateway implements InvocationAbstraction {

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

            co.uniminuto.edu.ws.ConsultaSaldoResponse instance = (co.uniminuto.edu.ws.ConsultaSaldoResponse) session.getAttribute("co.uniminuto.edu.ws.ConsultaSaldoResponse");
            if (instance == null) {
                instance = (co.uniminuto.edu.ws.ConsultaSaldoResponse) Class.forName("co.uniminuto.edu.ws.ConsultaSaldoResponse").newInstance();
                session.setAttribute("co.uniminuto.edu.ws.ConsultaSaldoResponse", instance);
            }
            return instance.getReturn();
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

    private static Object readObject(DataInput in) throws IOException {
        return Utility.readObject(in);
    }
}
//GEN-END:Client
