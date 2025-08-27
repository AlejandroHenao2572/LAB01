# Script para compilar y ejecutar el proyecto Java
# LAB01 - Desarrollo de Software

Write-Host "=== LAB01 - Compilador y Ejecutor Java ===" -ForegroundColor Green

# Crear directorio bin si no existe
if (!(Test-Path "bin")) {
    New-Item -ItemType Directory -Path "bin" | Out-Null
    Write-Host "Directorio 'bin' creado." -ForegroundColor Yellow
}

Write-Host "Compilando archivos Java..." -ForegroundColor Cyan

# Compilar archivos Java
$javaFiles = Get-ChildItem -Path "src\main\java" -Filter "*.java"
$sourceFiles = $javaFiles | ForEach-Object { $_.FullName }

try {
    javac -d bin -cp "src\main\java" @sourceFiles
    if ($LASTEXITCODE -eq 0) {
        Write-Host "✓ Compilación exitosa!" -ForegroundColor Green
        
        Write-Host "`nEjecutando programa..." -ForegroundColor Cyan
        Write-Host "=========================" -ForegroundColor Gray
        
        # Ejecutar el programa
        java -cp bin Main
        
        Write-Host "=========================" -ForegroundColor Gray
        Write-Host "✓ Ejecución completada!" -ForegroundColor Green
    } else {
        Write-Host "✗ Error en la compilación." -ForegroundColor Red
    }
} catch {
    Write-Host "✗ Error: $($_.Exception.Message)" -ForegroundColor Red
    Write-Host "Asegúrate de tener Java instalado y en el PATH." -ForegroundColor Yellow
}
