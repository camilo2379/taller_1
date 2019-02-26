package org.apache.jsp.paginas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class crearVehiculo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <title>Registro Cliente</title>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Playfair+Display:400,700|Work+Sans:300,400,700\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"../fonts/icomoon/style.css\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/magnific-popup.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/jquery-ui.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/owl.carousel.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/owl.theme.default.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/bootstrap-datepicker.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/animate.css\">\n");
      out.write("    \n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/mediaelement@4.2.7/build/mediaelementplayer.min.css\">\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <link rel=\"stylesheet\" href=\"../fonts/flaticon/font/flaticon.css\">\n");
      out.write("  \n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/aos.css\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/style.css\">\n");
      out.write("    \n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("  \n");
      out.write("  <div class=\"site-wrap\">\n");
      out.write("\n");
      out.write("    <div class=\"site-mobile-menu\">\n");
      out.write("      <div class=\"site-mobile-menu-header\">\n");
      out.write("        <div class=\"site-mobile-menu-close mt-3\">\n");
      out.write("          <span class=\"icon-close2 js-menu-toggle\"></span>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"site-mobile-menu-body\"></div>\n");
      out.write("    </div> <!-- .site-mobile-menu -->\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <div class=\"site-navbar-wrap js-site-navbar bg-white\">\n");
      out.write("      \n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"site-navbar bg-light\">\n");
      out.write("          <div class=\"py-1\">\n");
      out.write("            <div class=\"row align-items-center\">\n");
      out.write("              <div class=\"col-2\">\n");
      out.write("                <h2 class=\"mb-0 site-logo\"><a href=\"../index.html\">Vehialpes</a></h2>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col-10\">\n");
      out.write("                <nav class=\"site-navigation text-right\" role=\"navigation\">\n");
      out.write("                  <div class=\"container\">\n");
      out.write("                    \n");
      out.write("                    <div class=\"d-inline-block d-lg-none  ml-md-0 mr-auto py-3\"><a href=\"#\" class=\"site-menu-toggle js-menu-toggle\"><span class=\"icon-menu h3\"></span></a></div>\n");
      out.write("                    <ul class=\"site-menu js-clone-nav d-none d-lg-block\">\n");
      out.write("                      <li class=\"active\">\n");
      out.write("                        <a href=\"../index.html\">Inicio</a>\n");
      out.write("                      </li>\n");
      out.write("                      <li class=\"has-children\">\n");
      out.write("                        <a>Registro</a>\n");
      out.write("                        <ul class=\"dropdown arrow-top\">\n");
      out.write("                          <li class=\"has-children\">\n");
      out.write("                            <a >Cliente</a>\n");
      out.write("                            <ul class=\"dropdown\">\n");
      out.write("                              <li><a href=\"crear.jsp\">Registrar</a></li>\n");
      out.write("                              <li><a href=\"consultar.jsp\">Consultar</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                          </li>\n");
      out.write("                          <li class=\"has-children\">\n");
      out.write("                            <a >Vehiculo</a>\n");
      out.write("                            <ul class=\"dropdown\">\n");
      out.write("                              <li><a href=\"crearVehiculo.jsp\">Registrar</a></li>\n");
      out.write("                              <li><a href=\"consultarVehiculo.jsp\">Consultar</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                          </li>\n");
      out.write("                          <li class=\"has-children\">\n");
      out.write("                            <a >Venta</a>\n");
      out.write("                            <ul class=\"dropdown\">\n");
      out.write("                              <li><a href=\"crearVenta.jsp\">Registrar</a></li>\n");
      out.write("                              <li><a href=\"./paginas/consultarVenta.jsp\">Consultar</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                          </li>\n");
      out.write("                        </ul>\n");
      out.write("                      </li>\n");
      out.write("                      <li><a href=\"about.html\">About</a></li>\n");
      out.write("                      <li><a href=\"contact.html\">Contact</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                  </div>\n");
      out.write("                </nav>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div class=\"site-blocks-cover overlay\" style=\"background-image: url(../images/carro3.jpg);\" data-aos=\"fade\" data-stellar-background-ratio=\"0.5\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <div class=\"row align-items-center justify-content-center\">\n");
      out.write("            <div class=\"col-md-7 text-center\" data-aos=\"fade\">\n");
      out.write("                <h1 class=\"mb-2\">Registrar Vehiculo</h1>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>  \n");
      out.write("\n");
      out.write("    \n");
      out.write("    <div class=\"site-section site-section-sm\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("       \n");
      out.write("          <div class=\"col-md-12 col-lg-8 mb-5\">\n");
      out.write("           <form method=\"POST\" action=\"/taller_1/ControladorBienvenidaVehiculo\"> \n");
      out.write("\n");
      out.write("              <div>\n");
      out.write("                \n");
      out.write("              <div class=\"row form-group\">\n");
      out.write("                <div class=\"col-md-12 mb-3 mb-md-0\">\n");
      out.write("                  <label class=\"font-weight-bold\" for=\"name\">Matricula</label>\n");
      out.write("                  <input type=\"text\" name=\"matricula\" id=\"fullname\" class=\"form-control\" placeholder=\"Matricula\">\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("                  <div class=\"row form-group\">\n");
      out.write("                <div class=\"col-md-12 mb-3 mb-md-0\">\n");
      out.write("                  <label class=\"font-weight-bold\" for=\"name\">Nombre Vehiculo</label>\n");
      out.write("                  <input type=\"text\" name=\"nombreV\" id=\"fullname\" class=\"form-control\" placeholder=\"Nombre de vehiculo\">\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("                  <div class=\"row form-group\">\n");
      out.write("                <div class=\"col-md-12 mb-3 mb-md-0\">\n");
      out.write("                  <label class=\"font-weight-bold\" for=\"name\">Modelo</label>\n");
      out.write("                  <input type=\"text\" name=\"modelo\" id=\"fullname\" class=\"form-control\" placeholder=\"Modelo\">\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("                  <div class=\"row form-group\">\n");
      out.write("                <div class=\"col-md-12 mb-3 mb-md-0\">\n");
      out.write("                  <label class=\"font-weight-bold\" for=\"name\">Color </label>\n");
      out.write("                  <input type=\"text\" name=\"color\" id=\"fullname\" class=\"form-control\" placeholder=\"Color de vehiculo\">\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("                  <div class=\"row form-group\">\n");
      out.write("                <div class=\"col-md-12 mb-3 mb-md-0\">\n");
      out.write("                  <label class=\"font-weight-bold\" for=\"name\">Precio</label>\n");
      out.write("                  <input type=\"text\" name=\"precio\" id=\"fullname\" class=\"form-control\" placeholder=\"Precio\">\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("                  <div class=\"row form-group\">\n");
      out.write("                 <div class=\"col-md-12 mb-3 mb-md-0\">\n");
      out.write("                  <label class=\"font-weight-bold\" for=\"name\">Disponible</label>\n");
      out.write("                  <select  name=\"disponible\" id=\"fullname\" class=\"form-control\" >\n");
      out.write("                      <option selected=\"selected\">Si</option>\n");
      out.write("                      <option selected=\"selected\">No</option>\n");
      out.write("                  </select>   \n");
      out.write("                </div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"row form-group\">\n");
      out.write("                   <div class=\"col-md-12 mb-3 mb-md-0\">    \n");
      out.write("                  <label class=\"font-weight-bold\" for=\"name\">Tipo de Vehiculo</label>\n");
      out.write("                  <input type=\"number\" name=\"tipov\" id=\"fullname\" class=\"form-control\" placeholder=\"Tipo de vehiculo\">\n");
      out.write("                </div>\n");
      out.write("                </div> \n");
      out.write("                   <div class=\"row form-group\">\n");
      out.write("                   <div class=\"col-md-12 mb-3 mb-md-0\">    \n");
      out.write("                  <label class=\"font-weight-bold\" for=\"name\">Marca de vehiculo</label>\n");
      out.write("                  <input type=\"number\" name=\"marca\" id=\"fullname\" class=\"form-control\" placeholder=\"marca\">\n");
      out.write("                </div>\n");
      out.write("                </div> \n");
      out.write("              <div class=\"row form-group\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                  <input type=\"submit\" value=\"Registrar\" class=\"btn btn-primary pill px-4 py-2\">\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("                <a href=\"../index.html\"> Volver</a>\n");
      out.write("            </form>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          </form>\n");
      out.write("\n");
      out.write("            \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <footer class=\"site-footer\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-md-4\">\n");
      out.write("            <h3 class=\"footer-heading mb-4 text-white\">About</h3>\n");
      out.write("            <p>VehiAlpes es una\tempresa\tdedicada a la importación y comercialización de vehículos y repuestos a nivel nacional.</p>\n");
      out.write("            <p><a href=\"#\" class=\"btn btn-primary pill text-white px-4\">Read More</a></p>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-6\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col-md-6\">\n");
      out.write("                <h3 class=\"footer-heading mb-4 text-white\">Menu</h3>\n");
      out.write("                  <ul class=\"list-unstyled\">\n");
      out.write("                    <li><a href=\"#\">Inicio</a></li>\n");
      out.write("                    <li><a href=\"#\">Nosotros</a></li>\n");
      out.write("                    <li><a href=\"#\">Contactanos</a></li>\n");
      out.write("                  </ul>\n");
      out.write("              </div>\n");
      out.write("             \n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          \n");
      out.write("          <div class=\"col-md-2\">\n");
      out.write("            <div class=\"col-md-12\"><h3 class=\"footer-heading mb-4 text-white\">Social Icons</h3></div>\n");
      out.write("              <div class=\"col-md-12\">\n");
      out.write("                <p>\n");
      out.write("                  <a href=\"#\" class=\"pb-2 pr-2 pl-0\"><span class=\"icon-facebook\"></span></a>\n");
      out.write("                  <a href=\"#\" class=\"p-2\"><span class=\"icon-twitter\"></span></a>\n");
      out.write("                  <a href=\"#\" class=\"p-2\"><span class=\"icon-instagram\"></span></a>\n");
      out.write("                  <a href=\"#\" class=\"p-2\"><span class=\"icon-vimeo\"></span></a>\n");
      out.write("                  <a href=\"#\" class=\"p-2\"><span class=\"icon-youtube\"></span></a>\n");
      out.write("\n");
      out.write("                </p>\n");
      out.write("              </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row pt-5 mt-5 text-center\">\n");
      out.write("          <div class=\"col-md-12\">\n");
      out.write("            <p>\n");
      out.write("            <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("            Copyright &copy; <script data-cfasync=\"false\" src=\"/cdn-cgi/scripts/5c5dd728/cloudflare-static/email-decode.min.js\"></script><script>document.write(new Date().getFullYear());</script> All Rights Reserved \n");
      out.write("            <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("            </p>\n");
      out.write("          </div>\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </footer>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("  <script src=\"../js/jquery-3.3.1.min.js\"></script>\n");
      out.write("  <script src=\"../js/jquery-migrate-3.0.1.min.js\"></script>\n");
      out.write("  <script src=\"../js/jquery-ui.js\"></script>\n");
      out.write("  <script src=\"../js/popper.min.js\"></script>\n");
      out.write("  <script src=\"../js/bootstrap.min.js\"></script>\n");
      out.write("  <script src=\"../js/owl.carousel.min.js\"></script>\n");
      out.write("  <script src=\"../js/jquery.stellar.min.js\"></script>\n");
      out.write("  <script src=\"../js/jquery.countdown.min.js\"></script>\n");
      out.write("  <script src=\"../js/jquery.magnific-popup.min.js\"></script>\n");
      out.write("  <script src=\"../js/bootstrap-datepicker.min.js\"></script>\n");
      out.write("  <script src=\"../js/aos.js\"></script>\n");
      out.write("\n");
      out.write("  \n");
      out.write("  <script src=\"../js/mediaelement-and-player.min.js\"></script>\n");
      out.write("\n");
      out.write("  <script src=\"../js/main.js\"></script>\n");
      out.write("    \n");
      out.write("\n");
      out.write("  <script>\n");
      out.write("      document.addEventListener('DOMContentLoaded', function() {\n");
      out.write("                var mediaElements = document.querySelectorAll('video, audio'), total = mediaElements.length;\n");
      out.write("\n");
      out.write("                for (var i = 0; i < total; i++) {\n");
      out.write("                    new MediaElementPlayer(mediaElements[i], {\n");
      out.write("                        pluginPath: 'https://cdn.jsdelivr.net/npm/mediaelement@4.2.7/build/',\n");
      out.write("                        shimScriptAccess: 'always',\n");
      out.write("                        success: function () {\n");
      out.write("                            var target = document.body.querySelectorAll('.player'), targetTotal = target.length;\n");
      out.write("                            for (var j = 0; j < targetTotal; j++) {\n");
      out.write("                                target[j].style.visibility = 'visible';\n");
      out.write("                            }\n");
      out.write("                  }\n");
      out.write("                });\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("  </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
