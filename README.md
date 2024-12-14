<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Razelle Kent Calvario</title>
    <style>
        /* Existing styles retained and updated */
        .profile-pic {
    width: 150px;
    height: 150px;
    border-radius: 50%;
    object-fit: cover;
    animation: fadeIn 2s ease-in-out; /* Matches the heading animation */
}


        body {
            margin: 0;
            font-family: "Times New Roman", serif;
            color: black;
            background-color: white;
            overflow-x: hidden;
        }

        header {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            text-align: center;
            background-color: black;
            color: white;
        }

        header h1 {
            font-size: 3em;
            margin: 0;
            padding: 10px;
            background-color: black;
            color: white;
            border-radius: 5px;
            animation: fadeIn 2s ease-in-out;
        }

        section {
            padding: 50px;
            text-align: center;
            opacity: 0;
            transform: translateY(20px);
            animation: slideUp 1s ease-in-out forwards;
        }

        section p {
            margin: 10px 0;
        }

        .contact-section {
            background-color: black;
            color: white;
            padding: 50px;
            margin-top: 20px;
        }

        .carousel {
            display: flex;
            justify-content: center;
            align-items: center;
            margin-top: 30px;
            position: relative;
            height: 400px;
            overflow: hidden;
        }

        .carousel-container {
            display: flex;
            align-items: center;
        }

        .carousel img {
            width: 300px;
            height: auto;
            max-height: 100%;
            display: none;
            border: 2px solid black;
            border-radius: 10px;
            transition: opacity 1s ease-in-out;
            object-fit: cover;
        }

        .carousel img.active {
            display: block;
        }

        .fade-out {
            opacity: 0;
            transition: opacity 1s ease-in-out;
        }

        .arrow {
            cursor: pointer;
            font-size: 2em;
            user-select: none;
            position: absolute;
            top: 50%;
            transform: translateY(-50%);
            z-index: 3;
        }

        .arrow#prev {
            left: 10px;
        }

        .arrow#next {
            right: 10px;
        }

        .description {
            margin-left: 20px;
            font-size: 1.2em;
            color: black;
            max-width: 300px;
            text-align: left;
            transition: opacity 1s ease-in-out;
        }

        .description.fade-out {
            opacity: 0;
        }

        @keyframes fadeIn {
            from {
                opacity: 0;
            }
            to {
                opacity: 1;
            }
        }

        @keyframes slideUp {
            from {
                opacity: 0;
                transform: translateY(20px);
            }
            to {
                opacity: 1;
                transform: translateY(0);
            }
        }

        section:nth-child(2) {
            animation-delay: 0.5s;
        }

        section:nth-child(3) {
            animation-delay: 1s;
        }
    </style>
</head>
<body>
    <header>
        <h1>Razelle Kent Calvario</h1>
        <img src="C:\Users\Rommel Calvario\OneDrive\Desktop\PRACTICE\images.jpg\WIN_20241215_00_12_42_Pro.jpg" alt="Razelle Kent Calvario's Picture" class="profile-pic">
    </header>    
    <section>
        <h2>About Me</h2>
        <p>I'm Razelle Kent Calvario, a BSIT student, learning new things and using my skills to make some money on my own. I aim to avoid depending on my parent's money for personal use and college balance.</p>
        <p>Although my skills may not be as good as you might think, I can learn from my mistakes. I just need some time to adjust and adapt to the tasks given to me.</p>
        <p>Right below is my project from our school. Please check them out ^^ Thank you!</p>
    </section>
  
    <section>
        <h2>My Gallery</h2>
        <div class="carousel">
            <span class="arrow" id="prev">&#8592;</span>
            <div class="carousel-container">
            <img src="C:\Users\Rommel Calvario\OneDrive\Desktop\PRACTICE\images.jpg\emoji.jpg" alt="Image 1" class="active">
            <img src="C:\Users\Rommel Calvario\OneDrive\Desktop\PRACTICE\images.jpg\bussiness card.jpg" alt="Image 2">
            <img src="C:\Users\Rommel Calvario\OneDrive\Desktop\PRACTICE\images.jpg\image compreesed.jpg" alt="Image 3">
            <img src="C:\Users\Rommel Calvario\OneDrive\Desktop\PRACTICE\images.jpg\poem.jpg" alt="Image 4">
            <img src="C:\Users\Rommel Calvario\OneDrive\Desktop\PRACTICE\images.jpg\pokemon.jpg" alt="Image 5">
                <div class="description" id="image-description">This is My favorite activity of all time LOL </div>
            
            <span class="arrow" id="next">&#8594;</span>
        </div>
    </section>
    <section>
        <h2>Reflection</h2>
        <p>This section is dedicated to my thoughts and reflections on my learning journey. I believe that reflecting on my experiences helps me grow and improve my skills.</p>
        <p>Throughout my studies, I have encountered various challenges that have tested my abilities. However, each challenge has also provided me with valuable lessons that I will carry forward.</p>
        <p>I am committed to continuous learning and self-improvement, and I look forward to applying what I have learned in future projects.</p>
    </section>
    <section class="contact-section">
        <h2>Contact</h2>
        <p>Number: 09910083930</p>
        <p>Social: Quackk Y Quack</p>
        <p>Gmail: calvariorazellekent@gmail.com</p>
    </section>

    <script>
        const images = document.querySelectorAll('.carousel img');
        const descriptions = [
            "This is My favorite activity of all time LOL",
            "This is dora put alot of love of these activity because its dora :)",
            "This is Compressed and Uncompressed Image Activity i love your name its 10/10 anime",
            "This activity is a poem i love this poem i made my poem is inpired from a game called Ghost of tsushima i love the game its also history story is sad and wholesome",
            "AND THIS is 2nd FAVORITE ACTIVITY like bro Ditto is amazing pokemon who can shapeshift to anything >:)",
        ];
        const descriptionElement = document.getElementById('image-description');
        const prev = document.getElementById('prev');
        const next = document.getElementById('next');
        let currentIndex = 0;

        function updateCarousel(newIndex) {
            const currentImage = images[currentIndex];
            const currentDescription = descriptionElement;

            currentImage.classList.add('fade-out');
            currentDescription.classList.add('fade-out');

            setTimeout(() => {
                currentImage.classList.remove('active', 'fade-out');
                currentDescription.classList.remove('fade-out');
                
                const nextImage = images[newIndex];
                nextImage.classList.add('active');
                descriptionElement.textContent = descriptions[newIndex];
                currentIndex = newIndex;
            }, 1000); // Duration of fade-out
        }

        prev.addEventListener('click', () => {
            const newIndex = (currentIndex - 1 + images.length) % images.length;
            updateCarousel(newIndex);
        });

        next.addEventListener('click', () => {
            const newIndex = (currentIndex + 1) % images.length;
            updateCarousel(newIndex);
        });
    </script>
</body>
</html>
