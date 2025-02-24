package o;
/* loaded from: classes-dex2jar.jar:o/T1TransaksiTarikanFragment.class */
public final class T1TransaksiTarikanFragment {
    public static final <T> Class<T> a(setEmptyView<T> setemptyview) {
        subscribeReservationRescheduleEvent.e(setemptyview, "");
        Class<T> cls = (Class<T>) ((TransaksiBerhasilFragment_ViewBinding) setemptyview).d();
        if (!cls.isPrimitive()) {
            subscribeReservationRescheduleEvent.c(cls);
            return cls;
        }
        String name = cls.getName();
        Class<T> cls2 = cls;
        if (name != null) {
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        cls2 = (Class<T>) Double.class;
                        break;
                    } else {
                        cls2 = cls;
                        break;
                    }
                case 104431:
                    if (name.equals("int")) {
                        cls2 = (Class<T>) Integer.class;
                        break;
                    } else {
                        cls2 = cls;
                        break;
                    }
                case 3039496:
                    if (name.equals("byte")) {
                        cls2 = (Class<T>) Byte.class;
                        break;
                    } else {
                        cls2 = cls;
                        break;
                    }
                case 3052374:
                    if (name.equals("char")) {
                        cls2 = (Class<T>) Character.class;
                        break;
                    } else {
                        cls2 = cls;
                        break;
                    }
                case 3327612:
                    if (name.equals("long")) {
                        cls2 = (Class<T>) Long.class;
                        break;
                    } else {
                        cls2 = cls;
                        break;
                    }
                case 3625364:
                    if (name.equals("void")) {
                        cls2 = (Class<T>) Void.class;
                        break;
                    } else {
                        cls2 = cls;
                        break;
                    }
                case 64711720:
                    if (name.equals("boolean")) {
                        cls2 = (Class<T>) Boolean.class;
                        break;
                    } else {
                        cls2 = cls;
                        break;
                    }
                case 97526364:
                    if (name.equals("float")) {
                        cls2 = (Class<T>) Float.class;
                        break;
                    } else {
                        cls2 = cls;
                        break;
                    }
                case 109413500:
                    if (name.equals("short")) {
                        cls2 = (Class<T>) Short.class;
                        break;
                    } else {
                        cls2 = cls;
                        break;
                    }
                default:
                    cls2 = cls;
                    break;
            }
        }
        subscribeReservationRescheduleEvent.c(cls2);
        return cls2;
    }
}
