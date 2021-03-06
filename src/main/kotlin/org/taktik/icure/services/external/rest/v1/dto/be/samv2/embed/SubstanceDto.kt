package org.taktik.icure.services.external.rest.v1.dto.be.samv2.embed

class SubstanceDto(
        var code: String? = null,
        var chemicalForm: String? = null,
        var name: SamTextDto? = null,
        var note: SamTextDto? = null,
        var standardSubstances: List<StandardSubstanceDto>? = null
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as SubstanceDto

        if (code != other.code) return false
        if (chemicalForm != other.chemicalForm) return false
        if (name != other.name) return false
        if (note != other.note) return false
        if (standardSubstances != other.standardSubstances) return false

        return true
    }

    override fun hashCode(): Int {
        var result = code?.hashCode() ?: 0
        result = 31 * result + (chemicalForm?.hashCode() ?: 0)
        result = 31 * result + (name?.hashCode() ?: 0)
        result = 31 * result + (note?.hashCode() ?: 0)
        result = 31 * result + (standardSubstances?.hashCode() ?: 0)
        return result
    }
}
