package org.tempuri;

public class IService1Proxy implements org.tempuri.IService1 {
  private String _endpoint = null;
  private org.tempuri.IService1 iService1 = null;
  private String urlServicio;
  public IService1Proxy() {	  
//    _initIService1Proxy();
  }
  
  public IService1Proxy(String endpoint) {
    _endpoint = endpoint;
    _initIService1Proxy();
  }
  
  private void _initIService1Proxy() {
    try {
      iService1 = (new org.tempuri.Service1Locator(this.getUrlServicio())).getBasicHttpBinding_IService1();
      if (iService1 != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iService1)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iService1)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iService1 != null)
      ((javax.xml.rpc.Stub)iService1)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.IService1 getIService1() {
    if (iService1 == null)
      _initIService1Proxy();
    return iService1;
  }
  
  public org.datacontract.schemas._2004._07.componenteEntidad.ECarritoComprasOnline getInventoryByCodes(org.datacontract.schemas._2004._07.componenteEntidad.EUPC[] codes, java.lang.Integer mode, java.lang.Integer cartCode, java.lang.String store, java.lang.String reservationCode) throws java.rmi.RemoteException{
    if (iService1 == null)
      _initIService1Proxy();
    return iService1.getInventoryByCodes(codes, mode, cartCode, store, reservationCode);
  }
  
  public org.datacontract.schemas._2004._07.componenteEntidad.ECambioInventario[] getInventoryByUpcs(org.datacontract.schemas._2004._07.componenteEntidad.EUPC[] codes) throws java.rmi.RemoteException{
    if (iService1 == null)
      _initIService1Proxy();
    return iService1.getInventoryByUpcs(codes);
  }
  
  public org.datacontract.schemas._2004._07.componenteEntidad.ECambioInventario[] getInventory(java.lang.String lastSyncDate) throws java.rmi.RemoteException{
    if (iService1 == null)
      _initIService1Proxy();
    return iService1.getInventory(lastSyncDate);
  }
  
  public org.datacontract.schemas._2004._07.componenteEntidad.ECambioInventario[] getInventoryByStyleNumber(java.lang.String styleNumber, java.lang.Integer brandCode) throws java.rmi.RemoteException{
    if (iService1 == null)
      _initIService1Proxy();
    return iService1.getInventoryByStyleNumber(styleNumber, brandCode);
  }
  
  public org.datacontract.schemas._2004._07.componenteEntidad.EReservaOnline cancelReservation(java.lang.String reservationCode) throws java.rmi.RemoteException{
    if (iService1 == null)
      _initIService1Proxy();
    return iService1.cancelReservation(reservationCode);
  }
  
  public org.datacontract.schemas._2004._07.componenteEntidad.EDocumento[] getBuyingStatement(java.lang.String cardNumber, java.lang.String initialDate, java.lang.String finalDate) throws java.rmi.RemoteException{
    if (iService1 == null)
      _initIService1Proxy();
    return iService1.getBuyingStatement(cardNumber, initialDate, finalDate);
  }
  
  public org.datacontract.schemas._2004._07.componenteEntidad.EBonoDisponible getBonusAvalilable(java.lang.String cardNumber) throws java.rmi.RemoteException{
    if (iService1 == null)
      _initIService1Proxy();
    return iService1.getBonusAvalilable(cardNumber);
  }
  
  public org.datacontract.schemas._2004._07.componenteEntidad.EDataClienteVip getInfoClienteVip(java.lang.String numberClienteVip) throws java.rmi.RemoteException{
    if (iService1 == null)
      _initIService1Proxy();
    return iService1.getInfoClienteVip(numberClienteVip);
  }
  
  public org.datacontract.schemas._2004._07.componenteEntidad.EClienteVip[] getListaInfoClienteVip() throws java.rmi.RemoteException{
    if (iService1 == null)
      _initIService1Proxy();
    return iService1.getListaInfoClienteVip();
  }
  
  public org.datacontract.schemas._2004._07.componenteEntidad.EDataClienteVip[] getRevisionTodosClientesVip() throws java.rmi.RemoteException{
    if (iService1 == null)
      _initIService1Proxy();
    return iService1.getRevisionTodosClientesVip();
  }
  
  public java.lang.Boolean updateReservation(java.lang.String reservationCode, java.lang.Integer cartCode, java.lang.String store, java.lang.Integer validation, java.lang.String orden, java.lang.String identificacion, java.lang.String nombre, java.lang.String correo, java.lang.String tipoventa, java.lang.String gironegocio, java.lang.String codigo_transaccion, java.lang.String fecha_transaccion, java.lang.String numeroDocumento, java.lang.String fechaDocumento) throws java.rmi.RemoteException{
    if (iService1 == null)
      _initIService1Proxy();
    return iService1.updateReservation(reservationCode, cartCode, store, validation, orden, identificacion, nombre, correo, tipoventa, gironegocio, codigo_transaccion, fecha_transaccion, numeroDocumento, fechaDocumento);
  }
  
  public org.datacontract.schemas._2004._07.componenteEntidad.ECambioInventario[] getInventoryByBrandCode(java.lang.Integer brandCode) throws java.rmi.RemoteException{
    if (iService1 == null)
      _initIService1Proxy();
    return iService1.getInventoryByBrandCode(brandCode);
  }
  
  public org.datacontract.schemas._2004._07.componenteEntidad.EDataClienteVip[] getListInfoClienteVip(java.lang.String lastSyncDate) throws java.rmi.RemoteException{
    if (iService1 == null)
      _initIService1Proxy();
    return iService1.getListInfoClienteVip(lastSyncDate);
  }
  
  public java.lang.Integer updateInfoUpc(org.datacontract.schemas._2004._07.REPOEntidadRepositorio.EProducto upc) throws java.rmi.RemoteException{
    if (iService1 == null)
      _initIService1Proxy();
    return iService1.updateInfoUpc(upc);
  }
  
  public java.lang.Integer updateBonoVip(org.datacontract.schemas._2004._07.componenteEntidad.EBonoVip[] listaBonoVip) throws java.rmi.RemoteException{
    if (iService1 == null)
      _initIService1Proxy();
    return iService1.updateBonoVip(listaBonoVip);
  }
  
  public org.datacontract.schemas._2004._07.componenteEntidad.EStyleNumber[] getListStyleNumber(java.lang.String brandCode) throws java.rmi.RemoteException{
    if (iService1 == null)
      _initIService1Proxy();
    return iService1.getListStyleNumber(brandCode);
  }
  
  public org.datacontract.schemas._2004._07.componenteEntidad.EClienteVipWif[] getRenewalClientVip(java.lang.String lastSyncDate) throws java.rmi.RemoteException{
    if (iService1 == null)
      _initIService1Proxy();
    return iService1.getRenewalClientVip(lastSyncDate);
  }
  
  public java.lang.Boolean setNewClientVip() throws java.rmi.RemoteException{
    if (iService1 == null)
      _initIService1Proxy();
    return iService1.setNewClientVip();
  }
  
  public org.datacontract.schemas._2004._07.componenteEntidad.EDetalleVenta[] getDetailInvoice(java.lang.String lastSyncDate) throws java.rmi.RemoteException{
    if (iService1 == null)
      _initIService1Proxy();
    return iService1.getDetailInvoice(lastSyncDate);
  }
  
  public org.datacontract.schemas._2004._07.componenteEntidad.EGeneracionBonoVip[] getBonusClientListExternal(java.lang.String initialDate, java.lang.String finalDate, java.lang.String company, java.lang.String country) throws java.rmi.RemoteException{
    if (iService1 == null)
      _initIService1Proxy();
    return iService1.getBonusClientListExternal(initialDate, finalDate, company, country);
  }
  
  public org.datacontract.schemas._2004._07.componenteEntidad.EGeneracionBonoVip[] getTotalBonusClientListExternal(java.lang.String initialDate, java.lang.String finalDate, java.lang.String company, java.lang.String country) throws java.rmi.RemoteException{
    if (iService1 == null)
      _initIService1Proxy();
    return iService1.getTotalBonusClientListExternal(initialDate, finalDate, company, country);
  }
  
  public org.datacontract.schemas._2004._07.componenteEntidad.EClienteVipWif[] getUpdateRenewalClientVip(java.lang.String lastSyncDate) throws java.rmi.RemoteException{
    if (iService1 == null)
      _initIService1Proxy();
    return iService1.getUpdateRenewalClientVip(lastSyncDate);
  }
  
  public java.lang.String getGetNextNumber(java.lang.String puntoVenta, java.lang.String tipoDocumento) throws java.rmi.RemoteException{
    if (iService1 == null)
      _initIService1Proxy();
    return iService1.getGetNextNumber(puntoVenta, tipoDocumento);
  }
  
  public org.datacontract.schemas._2004._07.REPOEntidadRepositorio.EConfClienteB2B[] getConfigurationClientB2B(java.lang.String id) throws java.rmi.RemoteException{
    if (iService1 == null)
      _initIService1Proxy();
    return iService1.getConfigurationClientB2B(id);
  }
  
  public org.datacontract.schemas._2004._07.REPOEntidadRepositorio.EVentasOnline[] getSalesDetailWeb(java.util.Calendar fecha_ini, java.util.Calendar fecha_fin, java.lang.Integer pais) throws java.rmi.RemoteException{
    if (iService1 == null)
      _initIService1Proxy();
    return iService1.getSalesDetailWeb(fecha_ini, fecha_fin, pais);
  }
  
  public org.datacontract.schemas._2004._07.componenteEntidad.ENotaCredito getAvailableCreditNote(java.lang.String documento) throws java.rmi.RemoteException{
    if (iService1 == null)
      _initIService1Proxy();
    return iService1.getAvailableCreditNote(documento);
  }

public String getUrlServicio() {
	return urlServicio;
}

public void setUrlServicio(String urlServicio) {
	this.urlServicio = urlServicio;
}
  
  
}