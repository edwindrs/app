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

import co.uniminuto.edu.servlets.JavonGateways;
import co.uniminuto.edu.servlets.InvocationAbstraction;
import co.uniminuto.edu.servlets.Utility;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * An automatically-generated servlet gateway. This servlet provides J2ME access
 * to the following server-side methods and classes:
 *
 * <ul>
 * <li> sq.webtomobileservletsupport.StockQuoteSoapProxy.getQuote
 * </ul>
 */
public class WebToMobileServlet extends HttpServlet {

    /**
     * This constant indicates the command code for an invocation in the
     * standard protocol.
     */
    private final static short INVOCATION_CODE = 1;

    /**
     * This member indicates a successful result
     */
    private final static short RESULT_SUCCESSFUL = 1;

    /**
     * This member indicates a server side exception
     */
    private final static short RESULT_EXCEPTION = 2;

    /**
     * The version string for the protocol. This must match the client's version
     */
    private final static String PROTOCOL_VERSION = "???";

    /**
     * This member contains the method abstractions that can be invoked by the
     * servlet.
     */
    private final static Map METHODS;

    static {
        METHODS = new HashMap();
        METHODS.put(new Integer(46), new JavonGateways.co_uniminuto_edu_servlets_EquipogetDeporteIddeporte46Gateway());
        METHODS.put(new Integer(50), new JavonGateways.co_uniminuto_edu_servlets_EquipogetIdequipo50Gateway());
        METHODS.put(new Integer(49), new JavonGateways.co_uniminuto_edu_servlets_EquiposetEquipo49Gateway());
        METHODS.put(new Integer(51), new JavonGateways.co_uniminuto_edu_servlets_EquiposetIdequipo51Gateway());
        METHODS.put(new Integer(47), new JavonGateways.co_uniminuto_edu_servlets_EquiposetDeporteIddeporte47Gateway());
        METHODS.put(new Integer(48), new JavonGateways.co_uniminuto_edu_servlets_EquipogetEquipo48Gateway());
        METHODS.put(new Integer(79), new JavonGateways.co_uniminuto_edu_servlets_PartidosetResultado79Gateway());
        METHODS.put(new Integer(77), new JavonGateways.co_uniminuto_edu_servlets_PartidosetIdpartido77Gateway());
        METHODS.put(new Integer(72), new JavonGateways.co_uniminuto_edu_servlets_PartidogetEquipoIdequipo72Gateway());
        METHODS.put(new Integer(74), new JavonGateways.co_uniminuto_edu_servlets_PartidogetEquipoIdequipo174Gateway());
        METHODS.put(new Integer(75), new JavonGateways.co_uniminuto_edu_servlets_PartidosetEquipoIdequipo175Gateway());
        METHODS.put(new Integer(78), new JavonGateways.co_uniminuto_edu_servlets_PartidogetResultado78Gateway());
        METHODS.put(new Integer(76), new JavonGateways.co_uniminuto_edu_servlets_PartidogetIdpartido76Gateway());
        METHODS.put(new Integer(73), new JavonGateways.co_uniminuto_edu_servlets_PartidosetEquipoIdequipo73Gateway());
        METHODS.put(new Integer(20), new JavonGateways.co_uniminuto_edu_servlets_ConsultaUsuarioResponsesetReturn20Gateway());
        METHODS.put(new Integer(19), new JavonGateways.co_uniminuto_edu_servlets_ConsultaUsuarioResponsegetReturn19Gateway());
        METHODS.put(new Integer(95), new JavonGateways.co_uniminuto_edu_servlets_RegistrosetTelefono95Gateway());
        METHODS.put(new Integer(94), new JavonGateways.co_uniminuto_edu_servlets_RegistrogetTelefono94Gateway());
        METHODS.put(new Integer(87), new JavonGateways.co_uniminuto_edu_servlets_RegistrosetIdusuario87Gateway());
        METHODS.put(new Integer(91), new JavonGateways.co_uniminuto_edu_servlets_RegistrosetNombre91Gateway());
        METHODS.put(new Integer(92), new JavonGateways.co_uniminuto_edu_servlets_RegistrogetApellido92Gateway());
        METHODS.put(new Integer(89), new JavonGateways.co_uniminuto_edu_servlets_RegistrosetPassword89Gateway());
        METHODS.put(new Integer(86), new JavonGateways.co_uniminuto_edu_servlets_RegistrogetIdusuario86Gateway());
        METHODS.put(new Integer(88), new JavonGateways.co_uniminuto_edu_servlets_RegistrogetPassword88Gateway());
        METHODS.put(new Integer(90), new JavonGateways.co_uniminuto_edu_servlets_RegistrogetNombre90Gateway());
        METHODS.put(new Integer(96), new JavonGateways.co_uniminuto_edu_servlets_RegistrogetCorreo96Gateway());
        METHODS.put(new Integer(93), new JavonGateways.co_uniminuto_edu_servlets_RegistrosetApellido93Gateway());
        METHODS.put(new Integer(97), new JavonGateways.co_uniminuto_edu_servlets_RegistrosetCorreo97Gateway());
        METHODS.put(new Integer(24), new JavonGateways.co_uniminuto_edu_servlets_ConsultarEquipoResponsesetReturn24Gateway());
        METHODS.put(new Integer(23), new JavonGateways.co_uniminuto_edu_servlets_ConsultarEquipoResponsegetReturn23Gateway());
        METHODS.put(new Integer(123), new JavonGateways.co_uniminuto_edu_servlets_UsuariowsconsultaSaldo123Gateway());
        METHODS.put(new Integer(122), new JavonGateways.co_uniminuto_edu_servlets_UsuariowsconsultaUsuario122Gateway());
        METHODS.put(new Integer(124), new JavonGateways.co_uniminuto_edu_servlets_UsuariowssumarValor124Gateway());
        METHODS.put(new Integer(125), new JavonGateways.co_uniminuto_edu_servlets_Usuariowsregistro125Gateway());
        METHODS.put(new Integer(126), new JavonGateways.co_uniminuto_edu_servlets_UsuariowsrestarValor126Gateway());
        METHODS.put(new Integer(127), new JavonGateways.co_uniminuto_edu_servlets_VerDeportesResponsegetReturn127Gateway());
        METHODS.put(new Integer(128), new JavonGateways.co_uniminuto_edu_servlets_VerEquiposResponsegetReturn128Gateway());
        METHODS.put(new Integer(7), new JavonGateways.co_uniminuto_edu_servlets_ConsultaDeporteResponsegetReturn7Gateway());
        METHODS.put(new Integer(8), new JavonGateways.co_uniminuto_edu_servlets_ConsultaDeporteResponsesetReturn8Gateway());
        METHODS.put(new Integer(130), new JavonGateways.co_uniminuto_edu_servlets_VerPartidosApostarResponsegetReturn130Gateway());
        METHODS.put(new Integer(26), new JavonGateways.co_uniminuto_edu_servlets_CrearDeportesetDeporte26Gateway());
        METHODS.put(new Integer(25), new JavonGateways.co_uniminuto_edu_servlets_CrearDeportegetDeporte25Gateway());
        METHODS.put(new Integer(131), new JavonGateways.co_uniminuto_edu_servlets_VerPartidosResponsegetReturn131Gateway());
        METHODS.put(new Integer(28), new JavonGateways.co_uniminuto_edu_servlets_CrearEquiposetEquipo28Gateway());
        METHODS.put(new Integer(30), new JavonGateways.co_uniminuto_edu_servlets_CrearEquiposetIddeporte30Gateway());
        METHODS.put(new Integer(27), new JavonGateways.co_uniminuto_edu_servlets_CrearEquipogetEquipo27Gateway());
        METHODS.put(new Integer(29), new JavonGateways.co_uniminuto_edu_servlets_CrearEquipogetIddeporte29Gateway());
        METHODS.put(new Integer(13), new JavonGateways.co_uniminuto_edu_servlets_ConsultaSaldogetIdusuario13Gateway());
        METHODS.put(new Integer(14), new JavonGateways.co_uniminuto_edu_servlets_ConsultaSaldosetIdusuario14Gateway());
        METHODS.put(new Integer(54), new JavonGateways.co_uniminuto_edu_servlets_EquipowsconsultarEquipo54Gateway());
        METHODS.put(new Integer(53), new JavonGateways.co_uniminuto_edu_servlets_EquipowsverEquipos53Gateway());
        METHODS.put(new Integer(52), new JavonGateways.co_uniminuto_edu_servlets_EquipowscrearEquipo52Gateway());
        METHODS.put(new Integer(2), new JavonGateways.co_uniminuto_edu_servlets_ActualizarResultadosetArg02Gateway());
        METHODS.put(new Integer(3), new JavonGateways.co_uniminuto_edu_servlets_ActualizarResultadogetArg13Gateway());
        METHODS.put(new Integer(4), new JavonGateways.co_uniminuto_edu_servlets_ActualizarResultadosetArg14Gateway());
        METHODS.put(new Integer(1), new JavonGateways.co_uniminuto_edu_servlets_ActualizarResultadogetArg01Gateway());
        METHODS.put(new Integer(17), new JavonGateways.co_uniminuto_edu_servlets_ConsultaUsuariogetIdusuario17Gateway());
        METHODS.put(new Integer(18), new JavonGateways.co_uniminuto_edu_servlets_ConsultaUsuariosetIdusuario18Gateway());
        METHODS.put(new Integer(42), new JavonGateways.co_uniminuto_edu_servlets_DeportesetIddeporte42Gateway());
        METHODS.put(new Integer(40), new JavonGateways.co_uniminuto_edu_servlets_DeportesetDeporte40Gateway());
        METHODS.put(new Integer(41), new JavonGateways.co_uniminuto_edu_servlets_DeportegetIddeporte41Gateway());
        METHODS.put(new Integer(39), new JavonGateways.co_uniminuto_edu_servlets_DeportegetDeporte39Gateway());
        METHODS.put(new Integer(9), new JavonGateways.co_uniminuto_edu_servlets_ConsultaPartidogetArg09Gateway());
        METHODS.put(new Integer(10), new JavonGateways.co_uniminuto_edu_servlets_ConsultaPartidosetArg010Gateway());
        METHODS.put(new Integer(22), new JavonGateways.co_uniminuto_edu_servlets_ConsultarEquiposetIdequipo22Gateway());
        METHODS.put(new Integer(21), new JavonGateways.co_uniminuto_edu_servlets_ConsultarEquipogetIdequipo21Gateway());
        METHODS.put(new Integer(103), new JavonGateways.co_uniminuto_edu_servlets_SumarValorsetIdusuario103Gateway());
        METHODS.put(new Integer(102), new JavonGateways.co_uniminuto_edu_servlets_SumarValorgetIdusuario102Gateway());
        METHODS.put(new Integer(104), new JavonGateways.co_uniminuto_edu_servlets_SumarValorgetValor104Gateway());
        METHODS.put(new Integer(105), new JavonGateways.co_uniminuto_edu_servlets_SumarValorsetValor105Gateway());
        METHODS.put(new Integer(65), new JavonGateways.co_uniminuto_edu_servlets_ObjectFactorycreateConsultaSaldoResponse65Gateway());
        METHODS.put(new Integer(64), new JavonGateways.co_uniminuto_edu_servlets_ObjectFactorycreateConsultaSaldo64Gateway());
        METHODS.put(new Integer(69), new JavonGateways.co_uniminuto_edu_servlets_ObjectFactorycreateRestarValor69Gateway());
        METHODS.put(new Integer(67), new JavonGateways.co_uniminuto_edu_servlets_ObjectFactorycreateConsultaUsuario67Gateway());
        METHODS.put(new Integer(71), new JavonGateways.co_uniminuto_edu_servlets_ObjectFactorycreateSumarValor71Gateway());
        METHODS.put(new Integer(68), new JavonGateways.co_uniminuto_edu_servlets_ObjectFactorycreateConsultaUsuarioResponse68Gateway());
        METHODS.put(new Integer(63), new JavonGateways.co_uniminuto_edu_servlets_ObjectFactorycreateUsuario63Gateway());
        METHODS.put(new Integer(70), new JavonGateways.co_uniminuto_edu_servlets_ObjectFactorycreateRegistroResponse70Gateway());
        METHODS.put(new Integer(66), new JavonGateways.co_uniminuto_edu_servlets_ObjectFactorycreateRegistro66Gateway());
        METHODS.put(new Integer(36), new JavonGateways.co_uniminuto_edu_servlets_CrearPartidosetLocal36Gateway());
        METHODS.put(new Integer(37), new JavonGateways.co_uniminuto_edu_servlets_CrearPartidogetVisita37Gateway());
        METHODS.put(new Integer(33), new JavonGateways.co_uniminuto_edu_servlets_CrearPartidogetResultado33Gateway());
        METHODS.put(new Integer(34), new JavonGateways.co_uniminuto_edu_servlets_CrearPartidosetResultado34Gateway());
        METHODS.put(new Integer(31), new JavonGateways.co_uniminuto_edu_servlets_CrearPartidogetFecha31Gateway());
        METHODS.put(new Integer(32), new JavonGateways.co_uniminuto_edu_servlets_CrearPartidosetFecha32Gateway());
        METHODS.put(new Integer(38), new JavonGateways.co_uniminuto_edu_servlets_CrearPartidosetVisita38Gateway());
        METHODS.put(new Integer(35), new JavonGateways.co_uniminuto_edu_servlets_CrearPartidogetLocal35Gateway());
        METHODS.put(new Integer(5), new JavonGateways.co_uniminuto_edu_servlets_ConsultaDeportegetIddeporte5Gateway());
        METHODS.put(new Integer(6), new JavonGateways.co_uniminuto_edu_servlets_ConsultaDeportesetIddeporte6Gateway());
        METHODS.put(new Integer(100), new JavonGateways.co_uniminuto_edu_servlets_RestarValorgetValor100Gateway());
        METHODS.put(new Integer(101), new JavonGateways.co_uniminuto_edu_servlets_RestarValorsetValor101Gateway());
        METHODS.put(new Integer(98), new JavonGateways.co_uniminuto_edu_servlets_RestarValorgetIdusuario98Gateway());
        METHODS.put(new Integer(99), new JavonGateways.co_uniminuto_edu_servlets_RestarValorsetIdusuario99Gateway());
        METHODS.put(new Integer(43), new JavonGateways.co_uniminuto_edu_servlets_DeportewscrearDeporte43Gateway());
        METHODS.put(new Integer(45), new JavonGateways.co_uniminuto_edu_servlets_DeportewsverDeportes45Gateway());
        METHODS.put(new Integer(44), new JavonGateways.co_uniminuto_edu_servlets_DeportewsconsultaDeporte44Gateway());
        METHODS.put(new Integer(12), new JavonGateways.co_uniminuto_edu_servlets_ConsultaPartidoResponsesetReturn12Gateway());
        METHODS.put(new Integer(11), new JavonGateways.co_uniminuto_edu_servlets_ConsultaPartidoResponsegetReturn11Gateway());
        METHODS.put(new Integer(113), new JavonGateways.co_uniminuto_edu_servlets_UsuariosetNombre113Gateway());
        METHODS.put(new Integer(121), new JavonGateways.co_uniminuto_edu_servlets_UsuariosetTelefono121Gateway());
        METHODS.put(new Integer(107), new JavonGateways.co_uniminuto_edu_servlets_UsuariosetApellido107Gateway());
        METHODS.put(new Integer(119), new JavonGateways.co_uniminuto_edu_servlets_UsuariosetSaldo119Gateway());
        METHODS.put(new Integer(106), new JavonGateways.co_uniminuto_edu_servlets_UsuariogetApellido106Gateway());
        METHODS.put(new Integer(111), new JavonGateways.co_uniminuto_edu_servlets_UsuariosetIdusuario111Gateway());
        METHODS.put(new Integer(120), new JavonGateways.co_uniminuto_edu_servlets_UsuariogetTelefono120Gateway());
        METHODS.put(new Integer(112), new JavonGateways.co_uniminuto_edu_servlets_UsuariogetNombre112Gateway());
        METHODS.put(new Integer(108), new JavonGateways.co_uniminuto_edu_servlets_UsuariogetCorreo108Gateway());
        METHODS.put(new Integer(117), new JavonGateways.co_uniminuto_edu_servlets_UsuariosetRol117Gateway());
        METHODS.put(new Integer(109), new JavonGateways.co_uniminuto_edu_servlets_UsuariosetCorreo109Gateway());
        METHODS.put(new Integer(116), new JavonGateways.co_uniminuto_edu_servlets_UsuariogetRol116Gateway());
        METHODS.put(new Integer(118), new JavonGateways.co_uniminuto_edu_servlets_UsuariogetSaldo118Gateway());
        METHODS.put(new Integer(110), new JavonGateways.co_uniminuto_edu_servlets_UsuariogetIdusuario110Gateway());
        METHODS.put(new Integer(114), new JavonGateways.co_uniminuto_edu_servlets_UsuariogetPassword114Gateway());
        METHODS.put(new Integer(115), new JavonGateways.co_uniminuto_edu_servlets_UsuariosetPassword115Gateway());
        METHODS.put(new Integer(82), new JavonGateways.co_uniminuto_edu_servlets_PartidowsconsultaPartido82Gateway());
        METHODS.put(new Integer(80), new JavonGateways.co_uniminuto_edu_servlets_PartidowsactualizarResultado80Gateway());
        METHODS.put(new Integer(81), new JavonGateways.co_uniminuto_edu_servlets_PartidowscrearPartido81Gateway());
        METHODS.put(new Integer(84), new JavonGateways.co_uniminuto_edu_servlets_PartidowsverPartidosApostar84Gateway());
        METHODS.put(new Integer(85), new JavonGateways.co_uniminuto_edu_servlets_PartidowsverPartidos85Gateway());
        METHODS.put(new Integer(83), new JavonGateways.co_uniminuto_edu_servlets_PartidowsverPartidosActualizar83Gateway());
        METHODS.put(new Integer(129), new JavonGateways.co_uniminuto_edu_servlets_VerPartidosActualizarResponsegetReturn129Gateway());
        METHODS.put(new Integer(16), new JavonGateways.co_uniminuto_edu_servlets_ConsultaSaldoResponsesetReturn16Gateway());
        METHODS.put(new Integer(15), new JavonGateways.co_uniminuto_edu_servlets_ConsultaSaldoResponsegetReturn15Gateway());
    }

    /**
     * Called to handle a GET request. Returns a message that the servlet is
     * deployed
     *
     * @param req
     * @param resp
     */
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=iso-8859-1");
        String title = "WebToMobileServlet servlet status";
        String message = "WebToMobileServlet servlet active";
        OutputStream os = resp.getOutputStream();
        String response = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n"
                + "\"http://www.w3.org/TR/REC-html40/loose.dtd\">\n"
                + "<html>\n<head>\n"
                + "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\">"
                + "<title>" + title + "</title>\n"
                + "</head>\n<body>\n"
                + "<center><h1>" + message + "</h1></center>\n"
                + "</body>\n</html>\n";
        os.write(response.getBytes("ISO-8859-1"));
        os.close();
    }

    /**
     * Called by the server (via the service method) to allow a servlet to
     * handle a POST request. This method dispatches the calls to the underlying
     * class.
     *
     * @param req an HttpServletRequest object that contains the request the
     * client has made of the servlet
     * @param resp an HttpServletResponse object that contains the response the
     * servlet sends to the client
     * @exception ServletException - if the request for the POST could not be
     * handled
     * @throws IOException Description of Exception
     */
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("application/octet-stream");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DataOutputStream outputStream = new DataOutputStream(baos);
        DataOutput out = outputStream;
        int requestID = 0;
        try {
            short resultCode = RESULT_SUCCESSFUL;
            DataInputStream in = new DataInputStream(req.getInputStream());

            HttpSession session = req.getSession(true);

            String versionString = req.getHeader("version");
            if (versionString != null) {
                if (!versionString.equals(PROTOCOL_VERSION)) {
                    throw new IOException("Incompatible protocol version: "
                            + "Client's version '" + versionString + "' "
                            + "does not match server's version '"
                            + PROTOCOL_VERSION + "'");
                }
            }

            short commandCode = in.readShort();

            if (commandCode == INVOCATION_CODE) {
                requestID = in.readInt();
                Object returnValue = invokeMethod(session, requestID, in);
                out.writeShort(resultCode);
                Utility.writeResults(out, returnValue, ((InvocationAbstraction) METHODS.get(new Integer(requestID))).getReturnIds());
            }

            in.close();
        } catch (Exception err) {
            if (outputStream == null) {
                outputStream = new DataOutputStream(resp.getOutputStream());
                out = outputStream;
            }

            out.writeShort(RESULT_EXCEPTION);
            err.printStackTrace();
            String errMessage = err.getMessage();
            if (errMessage == null) {
                errMessage = "";
            }
            if (err instanceof IOException) {
                out.writeUTF(err.getMessage());
            } else {
                if (errMessage.length() > 0) {
                    errMessage = ": " + errMessage;
                }
                out.writeUTF(err.getClass().getName() + err.getMessage());
            }
        }
        outputStream.close();
        byte[] outputData = baos.toByteArray();
        resp.setContentLength(outputData.length);
        OutputStream httpOutputStream = resp.getOutputStream();
        try {
            httpOutputStream.write(outputData);
        } finally {
            httpOutputStream.close();
        }
    }

    /**
     * This method performs the actual invocation of server functionality.
     *
     * @param session The http session
     * @param requestID The id of a specific method invocation
     * @param input The stream from which we should read the parameters for the
     * methods
     * @return Description of the Returned Value
     * @throws IOException Thrown when a protocol/response error occurs
     */
    private Object invokeMethod(HttpSession session, int requestID, DataInput input) throws Exception {
        return ((InvocationAbstraction) METHODS.get(new Integer(requestID))).invoke(session, input);
    }
}
//GEN-END:Client
