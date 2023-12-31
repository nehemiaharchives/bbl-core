package org.gnit.bible

import kotlinx.serialization.Serializable

@Serializable(with = TranslationSerializer::class)
enum class Translation(val language: Language, val year: Int/*, val books: SparseArray<String>*/, val nativeName: String, val defaultSortOrder: Int) {
    // English World
    webus(Language.en, 2000/*, Books.ENGLISH_NUMBER_NAME_MAP*/, "World English Bible", 1), // English, Free of use
    kjv(Language.en, 1611/*, Books.ENGLISH_NUMBER_NAME_MAP*/, "King James Version", 2), // English, Public Domain

    // Latin America
    rvr09(Language.es, 1909/*, Books.SPANISH_NUMBER_NAME_MAP*/, "Reina Valera", 3), // Spanish, Public Domain
    tb(Language.pt, 1917/*, Books.PORTUGUESE_NUMBER_NAME_MAP*/, "Tradução Brasileira", 4), // Portuguese, Public Domain

    // Europe
    delut(Language.de, 1912/*, Books.GERMAN_NUMBER_NAME_MAP*/, "Lutherbibel", 5), // German, Public Domain

    // UK already included in English above
    lsg(Language.fr, 1910/*, Books.FRENCH_NUMBER_NAME_MAP*/, "Louis Segond Bible", 6), //French, Public Domain
    sinod(Language.ru, 1876/*, Books.RUSSIAN_NUMBER_NAME_MAP*/, "Синодальный перевод", 7), //Russian, Public Domain
    svrj(Language.nl, 1888/*, Books.DUTCH_NUMBER_NAME_MAP*/, "Statenvertaling Jongbloed-editie", 8), //Dutch, Public Domain
    rdv24(Language.it, 1924/*, Books.ITALIAN_NUMBER_NAME_MAP*/, "Versione Diodati Riveduta", 9), //Italian, Public Domain

    // Spain  already included in Spanish above
    ubg(Language.pl, 2017/*, Books.POLISH_NUMBER_NAME_MAP*/, "Uwspółcześniona Biblia gdańska", 10), //Polish, Copyright Uwspółcześniona Biblia Gdańska, All rights to reproduce and distribute free of charge are granted as long as the text of said publication is not altered in any way. Reproduction and distribution for profit requires written consent from the Publisher.
    ukrk(Language.uk, 1905/*, Books.UKRAINIAN_NUMBER_NAME_MAP*/, "Біблія в пер. П.Куліша та І.Пулюя", 11), //Ukrainian, Public Domain
    sven(Language.sv, 1917/*, Books.SWEDISH_NUMBER_NAME_MAP*/, "1917 års kyrkobibel", 12), //Swedish, Public Domain

    // North East Asia
    cunp(Language.zh, 1919/*, Books.CHINESE_NUMBER_NAME_MAP*/, "和合本", 13), // Chinese, Chinese Union Version with New Punctuation 新标点和合本, 神版 (Shén, e), Public Domain, default Chinese
    // TODO cunpsa(Language.zh, 1919, Books.CHINESE_NUMBER_NAME_MAP, "和合本", 13), // Chinese, Chinese Union Version with New Punctuation 新标点和合本, 上帝版(Shàngdì, a), Public Domain
    // TODO cunpte(Language.zh-TW,) //t: traditional e: 神版 (Shén, e)
    // TODO cunpta(Language.zh-TW,) //t: traditional a: 上帝版(Shàngdì, a)

    krv(Language.ko, 1961/*, Books.KOREAN_NUMBER_NAME_MAP*/, "개역한글", 14), // Korean, Korean Revised Version
    jc(Language.ja, 1955/*, Books.JAPANESE_JC_NUMBER_NAME_MAP*/, "口語訳", 15), // Japanese, Colloquial Japanese, Public Domain

    // South East Asia
    kttv(Language.vi, 1925/*, Books.VIETNAMESE_NUMBER_NAME_MAP*/, "Kinh Thánh Tiếng Việt", 16), // Vietnamese, Public Domain
    abtag(Language.tl, 1905/*, Books.TAGALOG_NUMBER_NAME_MAP*/, "Ang Biblia", 17), // Tagalog, Public Domain
    itb(Language.id, 1994/*, Books.INDONESIAN_NUMBER_NAME_MAP*/, "Indonesian Terjemahan Baru", 18), // Indonesian, Copyright Lembaga Alkitab Indonesia (Indonesian Bible Society), 1994. Released for non-profit scholarly and personal use. Not to be sold for profit.
    th1971(Language.th, 1971/*, Books.THAI_NUMBER_NAME_MAP*/, "พระคริสตธรรมคัมภีร์ ฉบับ1971", 19), // Thai, 1971 Bible, Public Domain

    // South Asia
    //hi( ,20), TODO Hindi
    //bn( ,21), TODO Bengali
    //ur( ,22), TODO Urdu
    //mr( ,23), TODO Marathi
    //te( ,24), TODO Telugu
    //ta( ,25), TODO Tamil
    npiulb(Language.ne, 2019/*, Books.NEPALI_NUMBER_NAME_MAP*/, "पवित्र बाइबल", 26), // Nepali, The Holy Bible in the Nepali language, Unlocked Literal Bible translation copyright © 2019 Door43 World Missions Community Creative Commons Attribution Share-Alike license 4.0.

    // Middle East
    //ar( ,27), TODO Modern Standard Arabic
    //tr( ,28), TODO Turkish
    ;

    fun shortName() = when(this){
        webus -> "WEB"
        cunp, krv, jc -> nativeName
        else -> name.uppercase()
    }
}