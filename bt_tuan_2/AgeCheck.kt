package com.yourpackage

object AgeCheck {
    fun classifyPerson(name: String, ageInput: String): String {
        if (ageInput.isBlank()) return "Vui lòng nhập tuổi!"
        val age = ageInput.toIntOrNull()
            ?: return "Tuổi phải là số hợp lệ!"

        return when {
            age <= 0 -> "Tuổi không hợp lệ!"
            age in 2..5 -> "$name là Trẻ em"
            age in 6..65 -> "$name là Người lớn"
            age > 65 -> "$name là Người già"
            else -> "$name chưa đủ tuổi để phân loại"
        }
    }
}
