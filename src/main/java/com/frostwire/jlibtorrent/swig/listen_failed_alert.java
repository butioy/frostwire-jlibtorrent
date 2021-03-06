/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class listen_failed_alert extends alert {
  private transient long swigCPtr;

  protected listen_failed_alert(long cPtr, boolean cMemoryOwn) {
    super(libtorrent_jni.listen_failed_alert_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(listen_failed_alert obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_listen_failed_alert(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public int type() {
    return libtorrent_jni.listen_failed_alert_type(swigCPtr, this);
  }

  public int category() {
    return libtorrent_jni.listen_failed_alert_category(swigCPtr, this);
  }

  public String what() {
    return libtorrent_jni.listen_failed_alert_what(swigCPtr, this);
  }

  public String message() {
    return libtorrent_jni.listen_failed_alert_message(swigCPtr, this);
  }

  public String listen_interface() {
    return libtorrent_jni.listen_failed_alert_listen_interface(swigCPtr, this);
  }

  public error_code getError() {
    long cPtr = libtorrent_jni.listen_failed_alert_error_get(swigCPtr, this);
    return (cPtr == 0) ? null : new error_code(cPtr, false);
  }

  public int getOperation() {
    return libtorrent_jni.listen_failed_alert_operation_get(swigCPtr, this);
  }

  public socket_type_t getSocket_type() {
    return socket_type_t.swigToEnum(libtorrent_jni.listen_failed_alert_socket_type_get(swigCPtr, this));
  }

  public address getAddress() {
    long cPtr = libtorrent_jni.listen_failed_alert_address_get(swigCPtr, this);
    return (cPtr == 0) ? null : new address(cPtr, false);
  }

  public int getPort() {
    return libtorrent_jni.listen_failed_alert_port_get(swigCPtr, this);
  }

  public final static int priority = libtorrent_jni.listen_failed_alert_priority_get();
  public final static int alert_type = libtorrent_jni.listen_failed_alert_alert_type_get();
  public final static int static_category = libtorrent_jni.listen_failed_alert_static_category_get();
  public final static class op_t {
    public final static listen_failed_alert.op_t parse_addr = new listen_failed_alert.op_t("parse_addr");
    public final static listen_failed_alert.op_t open = new listen_failed_alert.op_t("open");
    public final static listen_failed_alert.op_t bind = new listen_failed_alert.op_t("bind");
    public final static listen_failed_alert.op_t listen = new listen_failed_alert.op_t("listen");
    public final static listen_failed_alert.op_t get_socket_name = new listen_failed_alert.op_t("get_socket_name");
    public final static listen_failed_alert.op_t accept = new listen_failed_alert.op_t("accept");
    public final static listen_failed_alert.op_t enum_if = new listen_failed_alert.op_t("enum_if");
    public final static listen_failed_alert.op_t bind_to_device = new listen_failed_alert.op_t("bind_to_device");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static op_t swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + op_t.class + " with value " + swigValue);
    }

    private op_t(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private op_t(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private op_t(String swigName, op_t swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static op_t[] swigValues = { parse_addr, open, bind, listen, get_socket_name, accept, enum_if, bind_to_device };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
