/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class picker_log_alert extends peer_alert {
  private transient long swigCPtr;

  protected picker_log_alert(long cPtr, boolean cMemoryOwn) {
    super(libtorrent_jni.picker_log_alert_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(picker_log_alert obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_picker_log_alert(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public int type() {
    return libtorrent_jni.picker_log_alert_type(swigCPtr, this);
  }

  public int category() {
    return libtorrent_jni.picker_log_alert_category(swigCPtr, this);
  }

  public String what() {
    return libtorrent_jni.picker_log_alert_what(swigCPtr, this);
  }

  public String message() {
    return libtorrent_jni.picker_log_alert_message(swigCPtr, this);
  }

  public long getPicker_flags() {
    return libtorrent_jni.picker_log_alert_picker_flags_get(swigCPtr, this);
  }

  public final static int priority = libtorrent_jni.picker_log_alert_priority_get();
  public final static int alert_type = libtorrent_jni.picker_log_alert_alert_type_get();
  public final static int static_category = libtorrent_jni.picker_log_alert_static_category_get();
  public final static class picker_flags_t {
    public final static picker_log_alert.picker_flags_t partial_ratio = new picker_log_alert.picker_flags_t("partial_ratio", libtorrent_jni.picker_log_alert_partial_ratio_get());
    public final static picker_log_alert.picker_flags_t prioritize_partials = new picker_log_alert.picker_flags_t("prioritize_partials", libtorrent_jni.picker_log_alert_prioritize_partials_get());
    public final static picker_log_alert.picker_flags_t rarest_first_partials = new picker_log_alert.picker_flags_t("rarest_first_partials", libtorrent_jni.picker_log_alert_rarest_first_partials_get());
    public final static picker_log_alert.picker_flags_t rarest_first = new picker_log_alert.picker_flags_t("rarest_first", libtorrent_jni.picker_log_alert_rarest_first_get());
    public final static picker_log_alert.picker_flags_t reverse_rarest_first = new picker_log_alert.picker_flags_t("reverse_rarest_first", libtorrent_jni.picker_log_alert_reverse_rarest_first_get());
    public final static picker_log_alert.picker_flags_t suggested_pieces = new picker_log_alert.picker_flags_t("suggested_pieces", libtorrent_jni.picker_log_alert_suggested_pieces_get());
    public final static picker_log_alert.picker_flags_t prio_sequential_pieces = new picker_log_alert.picker_flags_t("prio_sequential_pieces", libtorrent_jni.picker_log_alert_prio_sequential_pieces_get());
    public final static picker_log_alert.picker_flags_t sequential_pieces = new picker_log_alert.picker_flags_t("sequential_pieces", libtorrent_jni.picker_log_alert_sequential_pieces_get());
    public final static picker_log_alert.picker_flags_t reverse_pieces = new picker_log_alert.picker_flags_t("reverse_pieces", libtorrent_jni.picker_log_alert_reverse_pieces_get());
    public final static picker_log_alert.picker_flags_t time_critical = new picker_log_alert.picker_flags_t("time_critical", libtorrent_jni.picker_log_alert_time_critical_get());
    public final static picker_log_alert.picker_flags_t random_pieces = new picker_log_alert.picker_flags_t("random_pieces", libtorrent_jni.picker_log_alert_random_pieces_get());
    public final static picker_log_alert.picker_flags_t prefer_contiguous = new picker_log_alert.picker_flags_t("prefer_contiguous", libtorrent_jni.picker_log_alert_prefer_contiguous_get());
    public final static picker_log_alert.picker_flags_t reverse_sequential = new picker_log_alert.picker_flags_t("reverse_sequential", libtorrent_jni.picker_log_alert_reverse_sequential_get());
    public final static picker_log_alert.picker_flags_t backup1 = new picker_log_alert.picker_flags_t("backup1", libtorrent_jni.picker_log_alert_backup1_get());
    public final static picker_log_alert.picker_flags_t backup2 = new picker_log_alert.picker_flags_t("backup2", libtorrent_jni.picker_log_alert_backup2_get());
    public final static picker_log_alert.picker_flags_t end_game = new picker_log_alert.picker_flags_t("end_game", libtorrent_jni.picker_log_alert_end_game_get());

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static picker_flags_t swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + picker_flags_t.class + " with value " + swigValue);
    }

    private picker_flags_t(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private picker_flags_t(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private picker_flags_t(String swigName, picker_flags_t swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static picker_flags_t[] swigValues = { partial_ratio, prioritize_partials, rarest_first_partials, rarest_first, reverse_rarest_first, suggested_pieces, prio_sequential_pieces, sequential_pieces, reverse_pieces, time_critical, random_pieces, prefer_contiguous, reverse_sequential, backup1, backup2, end_game };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
