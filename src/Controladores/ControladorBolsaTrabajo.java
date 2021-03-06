
package Controladores;

import Vistas.BarraDeNavegacion;
import Vistas.Paneles.BolsaTrabajo.VistaBolsaTrabajo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 ** NOMBRE CLASE:
 **	  ControladorBeneficiario
 **
 **
 **
 **
 ** DESARROLLADO POR:
 *          Raúl López Jiménez (RLJ)
 **
 **
 ** SUPERVISADO POR:
 **
 **
 ** HISTORIA:
 ** 	000 - 21 May 2012 - RLJ - Creacion del controlador
 **
 ** NOTAS:
 **
 **
 */
public class ControladorBolsaTrabajo {

    private static ControladorBolsaTrabajo instancia;
    private VistaBolsaTrabajo vista;

    public static ControladorBolsaTrabajo getIntance (VistaBolsaTrabajo panelBolsaTrabajo){
            if(instancia == null){
                instancia = new ControladorBolsaTrabajo(panelBolsaTrabajo);
            }
            return instancia;
    }

    private ControladorBolsaTrabajo(VistaBolsaTrabajo bvista){

        vista = bvista;

        vista.getBarraDeNavigacion().setListener(new ListenerBarraNavigacion());

        this.mostrarVistaInicio();

        vista.getBolsaTrabajoInicio().anadirListenerbtDemandasEmpleo(new btDemandasInicioListener());
        vista.getBolsaTrabajoInicio().anadirListenerbtOfertasEmpleo(new btOfertasInicioListener());
        vista.getDemandasInicio().anadirListenerbtConsultarDemanda(new btConsultarDemandaListener());
        vista.getDemandasInicio().anadirListenerbtNuevaDemanda(new btNuevaDemandaListener ());
        vista.getOfertasInicio().anadirListenerbtConsultarOfertas(new btConsultarOfertas());
        vista.getOfertasInicio().anadirListenerbtNuevaOferta(new btNuevaOferta());
    }   
/* __________________________    IMPLEMENTACION DE MOSTAR VISTAS    ________________*/
    public void mostrarVistaInicio(){
        vista.showPanel(VistaBolsaTrabajo.PanelInicio);
        vista.getBarraDeNavigacion().setTextLabelNivel1("Bolsa de Trabajo");
    }

    public void mostrarDemandasInicio(){
        vista.showPanel(VistaBolsaTrabajo.PanelDemandaInicio);
        vista.getBarraDeNavigacion().setTextLabelNivel2("Demandas");
    }

    public void mostrarOfertasInicio(){
        vista.showPanel(VistaBolsaTrabajo.PanelOfertasInicio);
        vista.getBarraDeNavigacion().setTextLabelNivel2("Ofertas");
    }
    
    public void mostrarConsultarDemandas(){
        vista.showPanel(VistaBolsaTrabajo.PanelConsultarDemandas);
        vista.getBarraDeNavigacion().setTextLabelNivel3("Consultar Demanda");
    }

    public void mostrarConsultarOfertas(){
        vista.showPanel(VistaBolsaTrabajo.PanelConsultarOfertas);
        vista.getBarraDeNavigacion().setTextLabelNivel3("Consultar Ofertas");
    }
    
    public void mostarNuevaDemanda(){
        vista.showPanel(VistaBolsaTrabajo.PanelNuevaDemanda);
        vista.getBarraDeNavigacion().setTextLabelNivel3("Nueva Demanda");
    }
    
    public void mostrarNuevaOferta() {
        vista.showPanel(VistaBolsaTrabajo.PanelNuevaOferta);
        vista.getBarraDeNavigacion().setTextLabelNivel3("Nueva Oferta");
    }
    
    public void mostrarModificarOferta() {
        vista.showPanel(VistaBolsaTrabajo.PanelModificarOferta);
        vista.getBarraDeNavigacion().setTextLabelNivel3("Modificar Oferta");
    }
    
    public void mostrarModificarDemanda() {
        vista.showPanel(VistaBolsaTrabajo.PanelModificarDemanda);
        vista.getBarraDeNavigacion().setTextLabelNivel3("Modificar Demanda");
    }
    
        public void mostrarBuscarOferta() {
        vista.showPanel(VistaBolsaTrabajo.PanelBuscarOfertas);
        vista.getBarraDeNavigacion().setTextLabelNivel3("Buscar Oferta");
    }
    
    public void mostrarBuscarDemanda() {
        vista.showPanel(VistaBolsaTrabajo.PanelBuscarDemandas);
        vista.getBarraDeNavigacion().setTextLabelNivel3("Buscar Demanda");
    }
    
 /* ____________________________    IMPLEMENTACION DE ACTION LISTENER    ________________________*/
    
    class btDemandasInicioListener implements ActionListener {

        @Override
       public void actionPerformed(ActionEvent ae){
           mostrarDemandasInicio();
       }
    }

    class btConsultarDemandaListener implements ActionListener {
        
        @Override
        public void actionPerformed (ActionEvent ea){
            mostrarBuscarDemanda();
        }
    }
    
    class btNuevaDemandaListener implements ActionListener {
    
        @Override
        public void actionPerformed (ActionEvent ea){
            mostarNuevaDemanda();
        }
    }
   
    class btOfertasInicioListener implements ActionListener {

        @Override
        public void actionPerformed (ActionEvent ea){
            mostrarOfertasInicio();
        }
    }
    class btConsultarOfertas implements ActionListener {
        
        @Override
        public void actionPerformed (ActionEvent ea){
            mostrarConsultarOfertas();
        }
    }
    
    class btNuevaOferta implements ActionListener {
    
        @Override
        public void actionPerformed (ActionEvent ea){
            mostrarNuevaOferta();
        }
    }
    

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
                        if (ae.getActionCommand().equalsIgnoreCase(BarraDeNavegacion.TO_NIVEL2)) {
                            if (vista.getBarraDeNavigacion().getTextLebelNivel2().equalsIgnoreCase("Demandas")){
				mostrarDemandasInicio();
                            }
                            else
                                 mostrarOfertasInicio();
			}
		}
	}


}
