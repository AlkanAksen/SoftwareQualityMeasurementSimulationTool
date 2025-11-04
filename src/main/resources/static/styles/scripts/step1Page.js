// Sağdaki listede seçili olma ve çıkma
document.querySelectorAll('#dimension-list li').forEach(item => {
  item.addEventListener('click', () => {
    item.classList.toggle('active'); // Eğer aktifse çıkar, değilse ekle
  });
});

// Sağ ok butonuna tıklanıldığında seçili öğeleri döndür
document.getElementById('next-button').addEventListener('click', () => {
  const selectedItems = [];
  document.querySelectorAll('#dimension-list li.active').forEach(item => {
    selectedItems.push(item.textContent.trim()); // Seçili öğeleri al
  });
  alert('Selected dimensions: ' + selectedItems.join(', ')); // Burada seçili öğeleri yazdırıyoruz
});
