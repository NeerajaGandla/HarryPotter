package com.neeraja.harrypotter.presentation.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\r\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\r\u00a2\u0006\u0002\u0010\u0011J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030\rH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030\rH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\nH\u00c6\u0003J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\u008e\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\rH\u00c6\u0001\u00a2\u0006\u0002\u0010/J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00103\u001a\u00020\nH\u00d6\u0001J\t\u00104\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\r\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0019\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\r\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\"\u0010\u0015\u00a8\u00065"}, d2 = {"Lcom/neeraja/harrypotter/presentation/models/House;", "", "id", "", "name", "mascot", "headOfHouse", "houseGhost", "founder", "__v", "", "school", "members", "", "Lcom/neeraja/harrypotter/presentation/models/Member;", "values", "colors", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Lcom/neeraja/harrypotter/presentation/models/Member;[Ljava/lang/String;[Ljava/lang/String;)V", "get__v", "()I", "getColors", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getFounder", "()Ljava/lang/String;", "getHeadOfHouse", "getHouseGhost", "getId", "getMascot", "getMembers", "()[Lcom/neeraja/harrypotter/presentation/models/Member;", "[Lcom/neeraja/harrypotter/presentation/models/Member;", "getName", "getSchool", "getValues", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Lcom/neeraja/harrypotter/presentation/models/Member;[Ljava/lang/String;[Ljava/lang/String;)Lcom/neeraja/harrypotter/presentation/models/House;", "equals", "", "other", "hashCode", "toString", "presentation_debug"})
public final class House {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String mascot = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String headOfHouse = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String houseGhost = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String founder = null;
    private final int __v = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String school = null;
    @org.jetbrains.annotations.NotNull()
    private final com.neeraja.harrypotter.presentation.models.Member[] members = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String[] values = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String[] colors = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMascot() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHeadOfHouse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHouseGhost() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFounder() {
        return null;
    }
    
    public final int get__v() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSchool() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.neeraja.harrypotter.presentation.models.Member[] getMembers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String[] getValues() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String[] getColors() {
        return null;
    }
    
    public House(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String mascot, @org.jetbrains.annotations.NotNull()
    java.lang.String headOfHouse, @org.jetbrains.annotations.NotNull()
    java.lang.String houseGhost, @org.jetbrains.annotations.NotNull()
    java.lang.String founder, int __v, @org.jetbrains.annotations.NotNull()
    java.lang.String school, @org.jetbrains.annotations.NotNull()
    com.neeraja.harrypotter.presentation.models.Member[] members, @org.jetbrains.annotations.NotNull()
    java.lang.String[] values, @org.jetbrains.annotations.NotNull()
    java.lang.String[] colors) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    public final int component7() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.neeraja.harrypotter.presentation.models.Member[] component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String[] component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String[] component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.neeraja.harrypotter.presentation.models.House copy(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String mascot, @org.jetbrains.annotations.NotNull()
    java.lang.String headOfHouse, @org.jetbrains.annotations.NotNull()
    java.lang.String houseGhost, @org.jetbrains.annotations.NotNull()
    java.lang.String founder, int __v, @org.jetbrains.annotations.NotNull()
    java.lang.String school, @org.jetbrains.annotations.NotNull()
    com.neeraja.harrypotter.presentation.models.Member[] members, @org.jetbrains.annotations.NotNull()
    java.lang.String[] values, @org.jetbrains.annotations.NotNull()
    java.lang.String[] colors) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}