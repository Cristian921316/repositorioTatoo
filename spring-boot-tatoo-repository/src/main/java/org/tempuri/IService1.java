/**
 * IService1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface IService1 extends java.rmi.Remote {
    public org.datacontract.schemas._2004._07.componenteEntidad.ECarritoComprasOnline getInventoryByCodes(org.datacontract.schemas._2004._07.componenteEntidad.EUPC[] codes, java.lang.Integer mode, java.lang.Integer cartCode, java.lang.String store, java.lang.String reservationCode) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.componenteEntidad.ECambioInventario[] getInventoryByUpcs(org.datacontract.schemas._2004._07.componenteEntidad.EUPC[] codes) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.componenteEntidad.ECambioInventario[] getInventory(java.lang.String lastSyncDate) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.componenteEntidad.ECambioInventario[] getInventoryByStyleNumber(java.lang.String styleNumber, java.lang.Integer brandCode) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.componenteEntidad.EReservaOnline cancelReservation(java.lang.String reservationCode) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.componenteEntidad.EDocumento[] getBuyingStatement(java.lang.String cardNumber, java.lang.String initialDate, java.lang.String finalDate) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.componenteEntidad.EBonoDisponible getBonusAvalilable(java.lang.String cardNumber) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.componenteEntidad.EDataClienteVip getInfoClienteVip(java.lang.String numberClienteVip) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.componenteEntidad.EClienteVip[] getListaInfoClienteVip() throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.componenteEntidad.EDataClienteVip[] getRevisionTodosClientesVip() throws java.rmi.RemoteException;
    public java.lang.Boolean updateReservation(java.lang.String reservationCode, java.lang.Integer cartCode, java.lang.String store, java.lang.Integer validation, java.lang.String orden, java.lang.String identificacion, java.lang.String nombre, java.lang.String correo, java.lang.String tipoventa, java.lang.String gironegocio, java.lang.String codigo_transaccion, java.lang.String fecha_transaccion, java.lang.String numeroDocumento, java.lang.String fechaDocumento) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.componenteEntidad.ECambioInventario[] getInventoryByBrandCode(java.lang.Integer brandCode) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.componenteEntidad.EDataClienteVip[] getListInfoClienteVip(java.lang.String lastSyncDate) throws java.rmi.RemoteException;
    public java.lang.Integer updateInfoUpc(org.datacontract.schemas._2004._07.REPOEntidadRepositorio.EProducto upc) throws java.rmi.RemoteException;
    public java.lang.Integer updateBonoVip(org.datacontract.schemas._2004._07.componenteEntidad.EBonoVip[] listaBonoVip) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.componenteEntidad.EStyleNumber[] getListStyleNumber(java.lang.String brandCode) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.componenteEntidad.EClienteVipWif[] getRenewalClientVip(java.lang.String lastSyncDate) throws java.rmi.RemoteException;
    public java.lang.Boolean setNewClientVip() throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.componenteEntidad.EDetalleVenta[] getDetailInvoice(java.lang.String lastSyncDate) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.componenteEntidad.EGeneracionBonoVip[] getBonusClientListExternal(java.lang.String initialDate, java.lang.String finalDate, java.lang.String company, java.lang.String country) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.componenteEntidad.EGeneracionBonoVip[] getTotalBonusClientListExternal(java.lang.String initialDate, java.lang.String finalDate, java.lang.String company, java.lang.String country) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.componenteEntidad.EClienteVipWif[] getUpdateRenewalClientVip(java.lang.String lastSyncDate) throws java.rmi.RemoteException;
    public java.lang.String getGetNextNumber(java.lang.String puntoVenta, java.lang.String tipoDocumento) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.REPOEntidadRepositorio.EConfClienteB2B[] getConfigurationClientB2B(java.lang.String id) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.REPOEntidadRepositorio.EVentasOnline[] getSalesDetailWeb(java.util.Calendar fecha_ini, java.util.Calendar fecha_fin, java.lang.Integer pais) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.componenteEntidad.ENotaCredito getAvailableCreditNote(java.lang.String documento) throws java.rmi.RemoteException;
}
