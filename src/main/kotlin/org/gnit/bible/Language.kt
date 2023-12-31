package org.gnit.bible

enum class Language {
    en, es, pt, de, fr, ru, nl, it, pl, uk, sv, zh, ko, ja, vi, tl, ne, id, th;

    fun defaultTranslation() = when(this){
        en -> Translation.webus
        es -> Translation.rvr09
        pt -> Translation.tb
        de -> Translation.delut
        fr -> Translation.lsg
        ru -> Translation.sinod
        nl -> Translation.svrj
        it -> Translation.rdv24
        pl -> Translation.ubg
        uk -> Translation.ukrk
        sv -> Translation.sven
        zh -> Translation.cunp
        ko -> Translation.krv
        ja -> Translation.jc
        vi -> Translation.kttv
        tl -> Translation.abtag
        ne -> Translation.npiulb
        id -> Translation.itb
        th -> Translation.th1971
    }
}