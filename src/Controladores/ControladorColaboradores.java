
package Controladores;

import Vistas.BarraDeNavegacion;
import Vistas.Paneles.Colaboradores.VistaColaboradores;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 ** NOMBRE CLASE:
 **	  ControladorBeneficiario
 **
 ** DESCRIPCION:
 **
 **
 **
 ** DESARROLLADO POR:
 *          Alberto Moreno Mantas (AMM)
 *
 **
 **
 ** SUPERVISADO POR:
 **
 **
 ** HISTORIA:
 ** 	000 - 20 May 2012 - AMM - Creacion
 **
 ** NOTAS:
 **
 **
 */
public class ControladorColaboradores {
    /** PATRON DE DISEÑO SINGLETON */

    private static ControladorColaboradores instancia;


    public static ControladorColaboradores getInstance(VistaColaboradores vistaColaboradores){
        if (instancia == null)
            instancia = new ControladorColaboradores(vistaColaboradores);

        return instancia;

    }

    private VistaColaboradores vista;

    /**
     * Constructor de la clase
     */
    private ControladorColaboradores(VistaColaboradores pvista){

	/**
     * Establece como ventana padre la pasada como parámetro
     */
	vista = pvista;

        // anadir listener
        vista.getBarraDeNavigacion().setListener(new ListenerBarraNavigacion());
        vista.getPanelColaboradoresInicio().anadirListenerbtColaborador(new btColaboradorListener());
        vista.getPanelColaboradoresInicio().anadirListenerbtSocio(new btSocioListener());
        vista.getPanelColaboradoresInicio().anadirListenerbtEmpresa(new btEmpresaListener());

        vista.getPanelSocioInicio().anadirListenerbtNuevoSocio(new btNuevoSocioListener());
        vista.getPanelSocioInicio().anadirListenerbtBuscarSocio(new btBuscarSocioListener());
        vista.getPanelEmpresaInicio().anadirListenerbtBuscarEmpresa(new btBuscarEmpresaListener());
        vista.getPanelEmpresaInicio().anadirListenerbtNuevoEmpresa(new btNuevaEmpresaListener());
        vista.getPanelColaboradorInicio().anadirListenerbtNuevoColaborador(new btNuevoColaboradorListener());
        vista.getPanelColaboradorInicio().anadirListenerbtBuscarColaborador(new btBuscarColaboradorListener());
        // al principio mostrar la vista de inicio
        mostrarVistaInicio();

    }

    // mostrar la vista que queremos y actualizacion de la barra de navigacion
    private void mostrarVistaInicio(){
        vista.showPanel(VistaColaboradores.panelColaboradoresInicio);
        vista.getBarraDeNavigacion().setTextLabelNivel1("Colaboradores");
    }

    private void mostrarVistaSocio(){
        vista.showPanel(VistaColaboradores.panelsocioInicio);
        vista.getBarraDeNavigacion().setTextLabelNivel1("Colaboradores");
        vista.getBarraDeNavigacion().setTextLabelNivel2("Socio");
    }

    private void mostrarVistaEmpresa(){
        vista.showPanel(VistaColaboradores.panelempresaInicio);
        vista.getBarraDeNavigacion().setTextLabelNivel1("Colaboradores");
        vista.getBarraDeNavigacion().setTextLabelNivel2("Empresa");
    }

      private void mostrarVistaColaborador(){
        vista.showPanel(VistaColaboradores.panelcolaboradorInicio);
        vista.getBarraDeNavigacion().setTextLabelNivel1("Colaboradores");
        vista.getBarraDeNavigacion().setTextLabelNivel2("Colaborador");
    }

    private void mostrarVistaSocioNuevo(){
        vista.showPanel(VistaColaboradores.panelsocioDatos);
        vista.getBarraDeNavigacion().setTextLabelNivel1("Colaboradores");
        vista.getBarraDeNavigacion().setTextLabelNivel2("Socio");
        vista.getBarraDeNavigacion().setTextLabelNivel3("Datos");
    }

    private void mostrarVistaSocioBuscar(){
        vista.showPanel(VistaColaboradores.panelsocioBuscar);
        vista.getBarraDeNavigacion().setTextLabelNivel1("Colaboradores");
        vista.getBarraDeNavigacion().setTextLabelNivel2("Socio");
        vista.getBarraDeNavigacion().setTextLabelNivel3("Buscar");
    }

    private void mostrarVistaEmpresaNuevo(){
        vista.showPanel(VistaColaboradores.panelempresaDatos);
        vista.getBarraDeNavigacion().setTextLabelNivel1("Colaboradores");
        vista.getBarraDeNavigacion().setTextLabelNivel2("Empresa");
        vista.getBarraDeNavigacion().setTextLabelNivel3("Datos");
    }

    private void mostrarVistaEmpresaBuscar(){
        vista.showPanel(VistaColaboradores.panelempresaBuscar);
        vista.getBarraDeNavigacion().setTextLabelNivel1("Colaboradores");
        vista.getBarraDeNavigacion().setTextLabelNivel2("Empresa");
        vista.getBarraDeNavigacion().setTextLabelNivel3("Buscar");
    }
    private void mostrarVistaColaboradorNuevo(){
        vista.showPanel(VistaColaboradores.panelcolaboradorDatos);
        vista.getBarraDeNavigacion().setTextLabelNivel1("Colaboradores");
        vista.getBarraDeNavigacion().setTextLabelNivel2("Colaborador");
        vista.getBarraDeNavigacion().setTextLabelNivel3("Datos");
    }

    private void mostrarVistaColaboradorBuscar(){
        vista.showPanel(VistaColaboradores.panelcolaboradorBuscar);
        vista.getBarraDeNavigacion().setTextLabelNivel1("Colaboradores");
        vista.getBarraDeNavigacion().setTextLabelNivel2("Colaborador");
        vista.getBarraDeNavigacion().setTextLabelNivel3("Buscar");
    }
    //Listener de la barra de navigacion
    class ListenerBarraNavigacion implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (ae.getActionCommand().equalsIgnoreCase(BarraDeNavegacion.TO_VISTA_INICIAL)) {
                mostrarVistaInicio();
                ControladorPrincipal.getInstance().mostrarVistaInicio();
            }

            if (ae.getActionCommand().equalsIgnoreCase(BarraDeNavegacion.TO_NIVEL1)) {
                mostrarVistaInicio();
            }
        }
    }


    // listeners de los botones
    class btSocioListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae) {
            mostrarVistaSocio();
        }
    }

    class btEmpresaListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae) {
            mostrarVistaEmpresa();
        }
    }

    class btColaboradorListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae) {
            mostrarVistaColaborador();
        }
    }

    class btNuevoSocioListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae) {
            mostrarVistaSocioNuevo();
        }
    }

   class btBuscarSocioListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae) {
            mostrarVistaSocioBuscar();
        }
    }
    class btNuevaEmpresaListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae) {
            mostrarVistaEmpresaNuevo();
        }
    }

   class btBuscarEmpresaListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae) {
            mostrarVistaEmpresaBuscar();
        }
    }
   class btNuevoColaboradorListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae) {
            mostrarVistaColaboradorNuevo();
        }
    }

   class btBuscarColaboradorListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae) {
            mostrarVistaColaboradorBuscar();
        }
    }
}
