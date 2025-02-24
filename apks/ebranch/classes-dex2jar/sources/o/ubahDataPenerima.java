package o;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;
/* loaded from: classes-dex2jar.jar:o/ubahDataPenerima.class */
public final class ubahDataPenerima {
    static final Type[] a = new Type[0];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/ubahDataPenerima$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer implements ParameterizedType, Serializable {
        private final Type[] a;
        private final Type b;
        private final Type e;

        public IconCompatParcelizer(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                if (!(type == null ? Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null : true)) {
                    throw new IllegalArgumentException();
                }
            }
            this.e = type == null ? null : ubahDataPenerima.e(type);
            this.b = ubahDataPenerima.e(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.a = typeArr2;
            int length = typeArr2.length;
            for (int i = 0; i < length; i++) {
                ubahDataPenerima.a(this.a[i]);
                Type[] typeArr3 = this.a;
                typeArr3[i] = ubahDataPenerima.e(typeArr3[i]);
            }
        }

        @Override // java.lang.Object
        public final boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && ubahDataPenerima.a(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type[] getActualTypeArguments() {
            return (Type[]) this.a.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getOwnerType() {
            return this.e;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getRawType() {
            return this.b;
        }

        @Override // java.lang.Object
        public final int hashCode() {
            return (Arrays.hashCode(this.a) ^ this.b.hashCode()) ^ ubahDataPenerima.d((Object) this.e);
        }

        @Override // java.lang.Object
        public final String toString() {
            int length = this.a.length;
            if (length == 0) {
                return ubahDataPenerima.d(this.b);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(ubahDataPenerima.d(this.b));
            sb.append("<");
            sb.append(ubahDataPenerima.d(this.a[0]));
            for (int i = 1; i < length; i++) {
                sb.append(", ");
                sb.append(ubahDataPenerima.d(this.a[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/ubahDataPenerima$read.class */
    public static final class read implements WildcardType, Serializable {
        private final Type a;
        private final Type e;

        public read(Type[] typeArr, Type[] typeArr2) {
            boolean z = true;
            if (typeArr2.length <= 1) {
                if (!(typeArr.length == 1)) {
                    throw new IllegalArgumentException();
                } else if (typeArr2.length == 1) {
                    ubahDataPenerima.a(typeArr2[0]);
                    if (typeArr[0] != Object.class) {
                        z = false;
                    }
                    if (z) {
                        this.e = ubahDataPenerima.e(typeArr2[0]);
                        this.a = Object.class;
                        return;
                    }
                    throw new IllegalArgumentException();
                } else {
                    ubahDataPenerima.a(typeArr[0]);
                    this.e = null;
                    this.a = ubahDataPenerima.e(typeArr[0]);
                }
            } else {
                throw new IllegalArgumentException();
            }
        }

        @Override // java.lang.Object
        public final boolean equals(Object obj) {
            return (obj instanceof WildcardType) && ubahDataPenerima.a(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getLowerBounds() {
            Type type = this.e;
            return type != null ? new Type[]{type} : ubahDataPenerima.a;
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getUpperBounds() {
            return new Type[]{this.a};
        }

        @Override // java.lang.Object
        public final int hashCode() {
            Type type = this.e;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.a.hashCode() + 31);
        }

        @Override // java.lang.Object
        public final String toString() {
            if (this.e != null) {
                StringBuilder sb = new StringBuilder("? super ");
                sb.append(ubahDataPenerima.d(this.e));
                return sb.toString();
            } else if (this.a == Object.class) {
                return "?";
            } else {
                StringBuilder sb2 = new StringBuilder("? extends ");
                sb2.append(ubahDataPenerima.d(this.a));
                return sb2.toString();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/ubahDataPenerima$write.class */
    public static final class write implements GenericArrayType, Serializable {
        private final Type c;

        public write(Type type) {
            this.c = ubahDataPenerima.e(type);
        }

        @Override // java.lang.Object
        public final boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && ubahDataPenerima.a(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public final Type getGenericComponentType() {
            return this.c;
        }

        @Override // java.lang.Object
        public final int hashCode() {
            return this.c.hashCode();
        }

        @Override // java.lang.Object
        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(ubahDataPenerima.d(this.c));
            sb.append("[]");
            return sb.toString();
        }
    }

    private static Type a(Type type, Class<?> cls, Class<?> cls2) {
        Type type2 = type;
        if (type instanceof WildcardType) {
            type2 = ((WildcardType) type).getUpperBounds()[0];
        }
        if (cls2.isAssignableFrom(cls)) {
            return e(type2, cls, e(type2, cls, cls2), new HashSet());
        }
        throw new IllegalArgumentException();
    }

    public static Type a(Type type, Class<?> cls, Type type2) {
        return e(type, cls, type2, new HashSet());
    }

    static void a(Type type) {
        if (!(!(type instanceof Class) || !((Class) type).isPrimitive())) {
            throw new IllegalArgumentException();
        }
    }

    public static boolean a(Type type, Type type2) {
        while (true) {
            boolean z = true;
            boolean z2 = true;
            boolean z3 = true;
            if (type == type2) {
                return true;
            }
            if (type instanceof Class) {
                return type.equals(type2);
            }
            if (type instanceof ParameterizedType) {
                if (!(type2 instanceof ParameterizedType)) {
                    return false;
                }
                ParameterizedType parameterizedType = (ParameterizedType) type;
                ParameterizedType parameterizedType2 = (ParameterizedType) type2;
                Type ownerType = parameterizedType.getOwnerType();
                Type ownerType2 = parameterizedType2.getOwnerType();
                if (!(ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) || !parameterizedType.getRawType().equals(parameterizedType2.getRawType()) || !Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                    z3 = false;
                }
                return z3;
            } else if (type instanceof GenericArrayType) {
                if (!(type2 instanceof GenericArrayType)) {
                    return false;
                }
                type = ((GenericArrayType) type).getGenericComponentType();
                type2 = ((GenericArrayType) type2).getGenericComponentType();
            } else if (type instanceof WildcardType) {
                if (!(type2 instanceof WildcardType)) {
                    return false;
                }
                WildcardType wildcardType = (WildcardType) type;
                WildcardType wildcardType2 = (WildcardType) type2;
                if (!Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) || !Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                    z = false;
                }
                return z;
            } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
                return false;
            } else {
                TypeVariable typeVariable = (TypeVariable) type;
                TypeVariable typeVariable2 = (TypeVariable) type2;
                if (typeVariable.getGenericDeclaration() != typeVariable2.getGenericDeclaration() || !typeVariable.getName().equals(typeVariable2.getName())) {
                    z2 = false;
                }
                return z2;
            }
        }
    }

    public static Class<?> b(Type type) {
        while (!(type instanceof Class)) {
            if (type instanceof ParameterizedType) {
                Type rawType = ((ParameterizedType) type).getRawType();
                if (rawType instanceof Class) {
                    return (Class) rawType;
                }
                throw new IllegalArgumentException();
            } else if (type instanceof GenericArrayType) {
                return Array.newInstance(b(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
            } else {
                if (type instanceof TypeVariable) {
                    return Object.class;
                }
                if (type instanceof WildcardType) {
                    type = ((WildcardType) type).getUpperBounds()[0];
                } else {
                    String name = type == null ? "null" : type.getClass().getName();
                    StringBuilder sb = new StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
                    sb.append(type);
                    sb.append("> is of type ");
                    sb.append(name);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        }
        return (Class) type;
    }

    public static Type c(Type type) {
        return type instanceof GenericArrayType ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
    }

    public static Type c(Type type, Class<?> cls) {
        Type a2 = a(type, cls, (Class<?>) Collection.class);
        Type type2 = a2;
        if (a2 instanceof WildcardType) {
            type2 = ((WildcardType) a2).getUpperBounds()[0];
        }
        return type2 instanceof ParameterizedType ? ((ParameterizedType) type2).getActualTypeArguments()[0] : Object.class;
    }

    static int d(Object obj) {
        return obj != null ? obj.hashCode() : 0;
    }

    public static String d(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static Type[] d(Type type, Class<?> cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type a2 = a(type, cls, (Class<?>) Map.class);
        return a2 instanceof ParameterizedType ? ((ParameterizedType) a2).getActualTypeArguments() : new Type[]{Object.class, Object.class};
    }

    public static Type e(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            Type type2 = cls;
            if (cls.isArray()) {
                type2 = new write(e(cls.getComponentType()));
            }
            return type2;
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new IconCompatParcelizer(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return new write(((GenericArrayType) type).getGenericComponentType());
        } else {
            if (!(type instanceof WildcardType)) {
                return type;
            }
            WildcardType wildcardType = (WildcardType) type;
            return new read(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
    }

    private static Type e(Type type, Class<?> cls, Class<?> cls2) {
        while (cls2 != cls) {
            if (cls2.isInterface()) {
                Class<?>[] interfaces = cls.getInterfaces();
                int length = interfaces.length;
                for (int i = 0; i < length; i++) {
                    Class<?> cls3 = interfaces[i];
                    if (cls3 == cls2) {
                        return cls.getGenericInterfaces()[i];
                    }
                    if (cls2.isAssignableFrom(cls3)) {
                        type = cls.getGenericInterfaces()[i];
                        cls = interfaces[i];
                        break;
                    }
                }
            }
            if (!cls.isInterface()) {
                while (cls != Object.class) {
                    cls = cls.getSuperclass();
                    if (cls == cls2) {
                        return cls.getGenericSuperclass();
                    }
                    if (cls2.isAssignableFrom(cls)) {
                        type = cls.getGenericSuperclass();
                    }
                }
            }
            return cls2;
        }
        return type;
    }

    private static Type e(Type type, Class<?> cls, Type type2, Collection<TypeVariable> collection) {
        TypeVariable typeVariable;
        TypeVariable typeVariable2;
        do {
            if (type2 instanceof TypeVariable) {
                typeVariable = (TypeVariable) type2;
                if (collection.contains(typeVariable)) {
                    return type2;
                }
                collection.add(typeVariable);
                GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
                Class cls2 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
                if (cls2 != null) {
                    Type e = e(type, cls, cls2);
                    if (e instanceof ParameterizedType) {
                        TypeVariable[] typeParameters = cls2.getTypeParameters();
                        int length = typeParameters.length;
                        for (int i = 0; i < length; i++) {
                            if (typeVariable.equals(typeParameters[i])) {
                                typeVariable2 = ((ParameterizedType) e).getActualTypeArguments()[i];
                                type2 = typeVariable2;
                            }
                        }
                        throw new NoSuchElementException();
                    }
                }
                typeVariable2 = typeVariable;
                type2 = typeVariable2;
            } else {
                if (type2 instanceof Class) {
                    Class cls3 = (Class) type2;
                    if (cls3.isArray()) {
                        Class<?> componentType = cls3.getComponentType();
                        Type e2 = e(type, cls, componentType, collection);
                        return componentType == e2 ? cls3 : new write(e2);
                    }
                }
                if (type2 instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) type2;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    Type e3 = e(type, cls, genericComponentType, collection);
                    return genericComponentType == e3 ? genericArrayType : new write(e3);
                } else if (type2 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type2;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type e4 = e(type, cls, ownerType, collection);
                    boolean z = e4 != ownerType;
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length2 = actualTypeArguments.length;
                    for (int i2 = 0; i2 < length2; i2++) {
                        Type e5 = e(type, cls, actualTypeArguments[i2], collection);
                        z = z;
                        actualTypeArguments = actualTypeArguments;
                        if (e5 != actualTypeArguments[i2]) {
                            z = z;
                            actualTypeArguments = actualTypeArguments;
                            if (!z) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                z = true;
                            }
                            actualTypeArguments[i2] = e5;
                        }
                    }
                    ParameterizedType parameterizedType2 = parameterizedType;
                    if (z) {
                        parameterizedType2 = new IconCompatParcelizer(e4, parameterizedType.getRawType(), actualTypeArguments);
                    }
                    return parameterizedType2;
                } else {
                    WildcardType wildcardType = type2;
                    if (type2 instanceof WildcardType) {
                        WildcardType wildcardType2 = (WildcardType) type2;
                        Type[] lowerBounds = wildcardType2.getLowerBounds();
                        Type[] upperBounds = wildcardType2.getUpperBounds();
                        if (lowerBounds.length == 1) {
                            Type e6 = e(type, cls, lowerBounds[0], collection);
                            wildcardType = wildcardType2;
                            if (e6 != lowerBounds[0]) {
                                return new read(new Type[]{Object.class}, e6 instanceof WildcardType ? ((WildcardType) e6).getLowerBounds() : new Type[]{e6});
                            }
                        } else {
                            wildcardType = wildcardType2;
                            if (upperBounds.length == 1) {
                                Type e7 = e(type, cls, upperBounds[0], collection);
                                wildcardType = wildcardType2;
                                if (e7 != upperBounds[0]) {
                                    return new read(e7 instanceof WildcardType ? ((WildcardType) e7).getUpperBounds() : new Type[]{e7}, a);
                                }
                            }
                        }
                    }
                    return wildcardType;
                }
            }
        } while (typeVariable2 != typeVariable);
        return typeVariable2;
    }
}
